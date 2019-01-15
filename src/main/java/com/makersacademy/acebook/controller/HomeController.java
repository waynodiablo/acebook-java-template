package com.makersacademy.acebook.controller;

import com.makersacademy.acebook.model.Post;
import com.makersacademy.acebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private final PostRepository postRepository;

    @Autowired
    public HomeController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts")
        public String show(Model model) {
            Iterable<Post> posts = postRepository.findAll();
            model.addAttribute("posts", posts);
            return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping(value = "/singlePost{postId}")
    public String singlePost(@PathVariable String postId, Model model) {
        model.addAttribute("postId", postId);
        return "singlePost";
    }

    @GetMapping("/testPosty")
    public String testPosty(Model model) {
        model.addAttribute("findById", postRepository.findById(5L).get().getContent());
        return "testPosty";

    }

    @GetMapping("/wall")
    public String wallPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "wall";

    }





}


//1)add GET end point, render HTML (similar to /greeting
//2)create an instance of a Post, and render to a template view
//3) modify to pass in a list of Posts
