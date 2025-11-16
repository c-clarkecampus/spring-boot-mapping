package com.example.helloworld.controller;

import com.example.helloworld.modal.Post;
import com.example.helloworld.service.GreetingService;
import com.example.helloworld.service.PostService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;
    private final GreetingService greetingService;

    public PostController(PostService postService, GreetingService greetingService) {
        this.postService = postService;
        this.greetingService = greetingService;
    }

    @PostMapping("/add")
    public String addNewPost(@Valid @RequestBody Post postDTO) {
        System.out.println("Title  = "+ postDTO.getTitle());
        System.out.println("Content = "+ postDTO.getContent());
        System.out.println("Privacy = "+ postDTO.getPrivacy());
        postService.addPost(postDTO);
        return postDTO.getTitle();
    }

    @GetMapping("/list")
    public List<Post> list() {

        return postService.findAll();
    }

    @PutMapping("/update")
    public void updatePost(@RequestBody Post postDTO) {

        postService.updatePost(postDTO);
    }


}
