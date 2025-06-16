package org.ironhack.lab10_security.repository;

import org.ironhack.lab10_security.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
}
