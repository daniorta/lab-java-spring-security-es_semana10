package org.ironhack.lab10_security.service;

import org.ironhack.lab10_security.dto.BlogPostDTO;
import org.ironhack.lab10_security.model.BlogPost;
import org.ironhack.lab10_security.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {

    //Inyección de dependencia por constructor
    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository){
        this.blogPostRepository = blogPostRepository;
    }

    //Agregar publicación
    public BlogPost createBlogPost(BlogPostDTO blogPostDTO){
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(blogPostDTO.getTitle());
        blogPost.setPost(blogPostDTO.getPost());

        BlogPost saveBlogPost = blogPostRepository.save(blogPost);

        return saveBlogPost;
    }

    //Actualizar publicación
    public BlogPost updateBlogPost(Long id, BlogPostDTO blogPostDTO){
        BlogPost blogPostFromDb = getBlogPostId(id);

        blogPostFromDb.setTitle(blogPostDTO.getTitle());
        blogPostFromDb.setPost(blogPostDTO.getPost());

        BlogPost saveBlogPost = blogPostRepository.save(blogPostFromDb);

        return saveBlogPost;

    }

    //Eliminar publicación
    public void deleteBlogPost(Long id){
        BlogPost blogPost = getBlogPostId(id);

        blogPostRepository.delete(blogPost);
    }

    public BlogPost getBlogPostId(Long id){
        return blogPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Id not found"));
    }
}
