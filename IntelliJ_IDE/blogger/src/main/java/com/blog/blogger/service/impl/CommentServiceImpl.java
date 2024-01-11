package com.blog.blogger.service.impl;


import com.blog.blogger.entity.Comment;
import com.blog.blogger.entity.Post;
import com.blog.blogger.exception.ResourcesNotFoundException;
import com.blog.blogger.payload.CommentDto;
import com.blog.blogger.repository.CommentRepository;
import com.blog.blogger.repository.PostRepository;
import com.blog.blogger.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

@Service
public class CommentServiceImpl implements CommentService {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    // Creating Add Comment Feature
    @Override
    public CommentDto createComment(long postId, CommentDto commentDto) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourcesNotFoundException("Post not found with id: " + postId)
        );

        Comment comment = new Comment();
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());

        comment.setPost(post);

        Comment savedComment = commentRepository.save(comment);

        CommentDto dto = new CommentDto();
        dto.setId(savedComment.getId());
        dto.setName(savedComment.getName());
        dto.setEmail(savedComment.getEmail());
        dto.setBody(savedComment.getBody());


        return dto;
    }

}
