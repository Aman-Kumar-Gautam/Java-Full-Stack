package com.blog.blogger.service;


import com.blog.blogger.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
}


