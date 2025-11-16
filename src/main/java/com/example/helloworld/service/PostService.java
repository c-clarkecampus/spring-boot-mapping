package com.example.helloworld.service;

import com.example.helloworld.modal.Post;
import com.example.helloworld.repository.PostRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Resource
    private PostRepository postRepository;

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();

    }

    public void updatePost(Post postDTO) {
        postRepository.save(postDTO);

    }
}
