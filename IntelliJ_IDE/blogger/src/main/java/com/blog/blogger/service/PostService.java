package com.blog.blogger.service;

import com.blog.blogger.payload.PostDto;

public interface PostService {


    public PostDto createPost(PostDto postDto);

    void deletePost(long id);
}
