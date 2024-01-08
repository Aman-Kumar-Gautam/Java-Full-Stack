package com.blog.blogger.service;

import com.blog.blogger.payload.PostDto;

import java.util.List;

public interface PostService {


    public PostDto createPost(PostDto postDto);

    void deletePost(long id);

    List<PostDto> geAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
