package org.ironhack.lab10_security.service;

import org.ironhack.lab10_security.dto.AuthorDTO;
import org.ironhack.lab10_security.model.Author;
import org.ironhack.lab10_security.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    //Inyección de dependencias por constructor
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    //1- Obtener la publicación y el autor.
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Author with ID " + id + " not found"));
    }


    //Agregar autor
    public Author createAuthor(AuthorDTO authorDTO){
        Author author = new Author();

        author.setName(authorDTO.getName());
        Author saveAuthor = authorRepository.save(author);
       return saveAuthor;
    }

    //Actualizar autor
    public Author UpdateAuthor(Long id, AuthorDTO authorDTO){
        Author authorFormDb = getAuthorId(id);
        authorFormDb.setName(authorDTO.getName());
        Author saveAuthor = authorFormDb;
        return saveAuthor;
    }

    //Eliminar autor
    public void deleteAuthor(Long id){
        Author author = getAuthorId(id);
        authorRepository.delete(author);
    }






    public Author getAuthorId(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id not found"));

    }


}
