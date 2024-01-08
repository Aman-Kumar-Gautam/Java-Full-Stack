package com.blog.blogger.service.impl;

import com.blog.blogger.entity.Post;
import com.blog.blogger.exception.ResourcesNotFoundException;
import com.blog.blogger.payload.PostDto;
import com.blog.blogger.repository.PostRepository;
import com.blog.blogger.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
   // @Autowired
    private PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createPost(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());


        Post savedPost = postRepo.save(post);


        PostDto dto = new PostDto();
        dto.setId(savedPost.getId());
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        dto.setMessage("post is created");

        return dto;
    }

    @Override

    /* Exception handling Method 1*/
//    public void deletePost(long id) {
//        Optional<Post> byId = postRepo.findById(id);
//        if(byId.isPresent()){
//            postRepo.deleteById(id);
//        }else{
//            throw new ResourcesNotFoundException("Post not found with id: "+id);
//        }
//    }
    /* Exception handling Method 2 using Lambda Expression */
    public void deletePost(long id) {
        Post post = postRepo.findById(id).orElseThrow(
                ()->new ResourcesNotFoundException("Post not found with id: "+id)
        );
    }


    @Override
    public List<PostDto> geAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo,pageSize, sort);
        Page<Post> pagePosts = postRepo.findAll(pageable);
        List<Post> posts = pagePosts.getContent();
    List<PostDto> dtos  = posts.stream().map(p-> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }

    PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        dto.setMessage("post is created");

        return dto;
    }



}
