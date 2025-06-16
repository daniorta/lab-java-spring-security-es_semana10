package org.ironhack.lab10_security.controller;

import org.ironhack.lab10_security.dto.AuthorDTO;
import org.ironhack.lab10_security.model.Author;
import org.ironhack.lab10_security.service.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    //Obtener la publicación y el autor
    @GetMapping("/{id}")
    public Author getAuthorWithPosts(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping()
    public Author createAuthor(@RequestBody AuthorDTO authorDTO){
        return authorService.createAuthor(authorDTO);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id,@RequestBody AuthorDTO authorDTO){
        return authorService.UpdateAuthor(id, authorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteAuthor(id);
    }



}