package com.blog.blogger.controller;

import com.blog.blogger.payload.PostDto;
import com.blog.blogger.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/posts")
public class PostController {
    public PostController(PostService postService) {
        this.postService = postService;
    }

    private PostService postService;
    @PostMapping

    public ResponseEntity<String> createPost(@RequestBody PostDto postDto){
        postService.createPost(postDto);
        return new ResponseEntity<> ("Post is created", HttpStatus.CREATED);
    }
}
;