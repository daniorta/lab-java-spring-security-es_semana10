package org.ironhack.lab10_security.repository;

import org.ironhack.lab10_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // List<User> findByUsername (String username); --> no necesario porque el username es único

    // todo change to optional
    User findByUsername(String username);
}