package com.spring.ecurieApp.repositories;

import com.spring.ecurieApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

    User findByUsername(String username);

    @Query("select u from User u where u.id = ?1")
    User findOne(long ID);
}
