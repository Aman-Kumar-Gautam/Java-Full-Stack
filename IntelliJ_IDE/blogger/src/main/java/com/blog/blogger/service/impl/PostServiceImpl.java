package com.blog.blogger.service.impl;

import com.blog.blogger.entity.Post;
import com.blog.blogger.payload.PostDto;
import com.blog.blogger.repository.PostRepository;
import com.blog.blogger.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
   // @Autowired
    private PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public void createPost(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());


        postRepo.save(post);
    }
}
