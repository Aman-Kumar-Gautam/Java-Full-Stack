package com.blog.blogger.controller;

import com.blog.blogger.payload.PostDto;
import com.blog.blogger.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {
    public PostController(PostService postService) {
        this.postService = postService;
    }

    private PostService postService;
    @PostMapping

    public ResponseEntity<?> createPost(@Valid @RequestBody PostDto postDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<> (dto, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable long id){
        postService.deletePost(id);
        return new ResponseEntity<> ("Post is deleted", HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<PostDto>>getAllPosts(
            @RequestParam(name="pageNo",defaultValue = "0", required = false) int pageNo,
            @RequestParam(name="pageSize", defaultValue = "3", required = false) int pageSize,
            @RequestParam(name="sortBy", defaultValue="id", required = false) String sortBy,
            @RequestParam(name="sortDir", defaultValue="asc", required = false) String sortDir
    ){
        List<PostDto> postDtos = postService.geAllPosts(pageNo, pageSize, sortBy, sortDir);
        return new ResponseEntity<> (postDtos, HttpStatus.OK);
    }




    //http://localhost:8080/api/posts?postId=1
    @PutMapping
    public ResponseEntity<PostDto> updatePost(
            @RequestParam("postId") long postId,
            @RequestBody PostDto postDto
    ){
        PostDto dto = postService.updatePost(postId, postDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
