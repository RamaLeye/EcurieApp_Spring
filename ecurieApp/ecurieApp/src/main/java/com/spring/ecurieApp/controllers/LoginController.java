package com.spring.ecurieApp.controllers;
import com.spring.ecurieApp.services.EmployeService;
import com.spring.ecurieApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Controller
public class LoginController  {

    @Autowired
    private UserService userService;
    @Autowired
    private EmployeService employeService;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping(value ="/login", method = RequestMethod.GET)
    public String loginPage( ){
        return "login";
    }

    @RequestMapping(value ="/menu", method = RequestMethod.GET)
    public String menu( ){
        return "menu";
    }



  /*  @RequestMapping(value = "/login", method = RequestMethod.)
    public String add( @RequestParam("username") String username, @RequestParam("password") String pwd){
       return "login";
    }*/


    @RequestMapping("/register")
    public String registerPage(){
        return "register";
    }





}
