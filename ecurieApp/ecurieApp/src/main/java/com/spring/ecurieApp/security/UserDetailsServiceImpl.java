package com.spring.ecurieApp.security;

import com.spring.ecurieApp.models.User;
import com.spring.ecurieApp.repositories.UserRepository;
import com.spring.ecurieApp.security.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepo;

    public UserDetailsServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepo.findByUsername(s);

        UserDetailsImpl userDetails = new UserDetailsImpl(user);

        return userDetails;
    }
}
