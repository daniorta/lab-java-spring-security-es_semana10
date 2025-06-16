package org.ironhack.lab10_security.config;

import lombok.RequiredArgsConstructor;
import org.ironhack.lab10_security.model.Author;
import org.ironhack.lab10_security.model.BlogPost;
import org.ironhack.lab10_security.model.Role;
import org.ironhack.lab10_security.model.User;
import org.ironhack.lab10_security.repository.AuthorRepository;
import org.ironhack.lab10_security.repository.BlogPostRepository;
import org.ironhack.lab10_security.service.RoleService;
import org.ironhack.lab10_security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor //no construimos el constructor de manera manual
public class DataLoader implements CommandLineRunner {


    private final UserService userService;
    private final RoleService roleService;

    private final AuthorRepository authorRepository;
    private final BlogPostRepository blogPostRepository;

    @Override
    public void run(String... args) throws Exception {


        roleService.save(new Role("ROLE_USER"));
        roleService.save(new Role("ROLE_ADMIN"));

        userService.saveUser(new User("John Doe", "john", "1234"));
        userService.saveUser(new User("James Smith", "james", "1234"));
        userService.saveUser(new User("Jane Carry", "jane", "1234"));
        userService.saveUser(new User("Chris Anderson", "chris", "1234"));

        roleService.addRoleToUser("john", "ROLE_USER");
        roleService.addRoleToUser("james", "ROLE_ADMIN");
        roleService.addRoleToUser("jane", "ROLE_USER");
        roleService.addRoleToUser("chris", "ROLE_ADMIN");
        roleService.addRoleToUser("chris", "ROLE_USER");



        // Crear Authores antes de asignarlos a BlogPosts
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        author1.setName("Aiko Tanaka");

        author2.setName("Jonas Schmidt");

        author3.setName("Cas Van Dijk");


        // Creación de BlogPost
        BlogPost blogPost1 = new BlogPost();
        BlogPost blogPost2 = new BlogPost();
        BlogPost blogPost3 = new BlogPost();

        blogPost1.setTitle("Boost Your Productivity with 10 Easy Tips");
        blogPost1.setPost("Productivity - we all want it but it seems ...");

        blogPost2.setTitle("How to Focus");
        blogPost2.setPost("Do you ever sit down to work and find yourself ...");

        blogPost3.setTitle("Learn to Speed Read in 30 Days");
        blogPost3.setPost("Knowledge, not ability, is the great determiner of ...");

        // Asignar autores a blog post
        blogPost1.setAuthor(author1);
        blogPost2.setAuthor(author2);
        blogPost3.setAuthor(author3);

        // También asigna los blog posts a los autores
        author1.addBlogPost(blogPost1);
        author2.addBlogPost(blogPost2);
        author3.addBlogPost(blogPost3);

        authorRepository.saveAll(List.of(author1, author2, author3));
    }
}
