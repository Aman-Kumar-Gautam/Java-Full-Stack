package com.blog.blogger.controller;

import com.blog.blogger.payload.CommentDto;
import com.blog.blogger.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    private CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentDto> createComment(

            @RequestParam("postId") long postId,
            @RequestBody CommentDto commentDto){
        CommentDto dto = commentService.createComment(postId, commentDto);
        return  new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


// Delete Comment Feature


    @DeleteMapping("/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable long commentId){
        commentService.deleteComment(commentId);
        return new ResponseEntity<>("Comment is deleted",HttpStatus.OK);
    }



    @GetMapping("/{postId}")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(@PathVariable long postId){
        List<CommentDto> commentDto = commentService.getCommentsByPostId(postId);
        return new ResponseEntity<>(commentDto, HttpStatus.OK);


    }

}
