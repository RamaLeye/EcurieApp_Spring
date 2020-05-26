package com.spring.ecurieApp.services.Implementations;

import com.spring.ecurieApp.models.User;
import com.spring.ecurieApp.repositories.UserRepository;
import com.spring.ecurieApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findById(int idUser) {
        return userRepository.findOne((long)idUser);
    }

    @Override
    public void delete(User user) {
        userRepository.deleteById(user.getId());
    }



    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User userToUpdate, String username, String pwd) {
        userToUpdate.setUsername(username);
        userToUpdate.setPassword(pwd);
        return save(userToUpdate);
    }
}
