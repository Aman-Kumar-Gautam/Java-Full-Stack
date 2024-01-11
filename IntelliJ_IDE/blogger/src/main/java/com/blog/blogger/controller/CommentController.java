package com.blog.blogger.controller;

import com.blog.blogger.payload.CommentDto;
import com.blog.blogger.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



}
