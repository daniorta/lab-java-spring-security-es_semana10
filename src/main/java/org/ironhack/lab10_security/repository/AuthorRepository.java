package org.ironhack.lab10_security.repository;

import org.ironhack.lab10_security.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
