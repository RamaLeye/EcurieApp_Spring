package com.spring.ecurieApp.services;

import com.spring.ecurieApp.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    
    List<User> findAll();


    User addUser(User User);


    User findByUsername(String username);


    User findById(int idUser);


    void delete(User user);



    User save(User user);


    User update(User userToUpdate, String username, String pwd);
}

