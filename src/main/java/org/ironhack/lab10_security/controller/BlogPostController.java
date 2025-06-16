package org.ironhack.lab10_security.controller;

import jakarta.servlet.ServletRequest;
import org.ironhack.lab10_security.dto.BlogPostDTO;
import org.ironhack.lab10_security.model.BlogPost;
import org.ironhack.lab10_security.service.BlogPostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blogPost")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService ){
        this.blogPostService = blogPostService;
    }

    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPostDTO blogPostDTO){
        return blogPostService.createBlogPost(blogPostDTO);
    }

    @PutMapping("/{id}")
    public BlogPost updateBlogPost(@PathVariable Long id, @RequestBody BlogPostDTO blogPostDTO){
        return blogPostService.updateBlogPost(id, blogPostDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBlogPost(@PathVariable Long id, ServletRequest servletRequest){
        blogPostService.deleteBlogPost(id);
    }
}
