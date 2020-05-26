package com.spring.ecurieApp.controllers;

import com.spring.ecurieApp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/secretary")
public class SecretaryController {


    @RequestMapping(value="/indexSecretary", method = RequestMethod.GET)
    public String secretaryIndexPage(HttpServletRequest request, Model model){

        User user = (User) request.getSession().getAttribute("connectedUser");

        model.addAttribute("connectedUser", user);

        return "/secretary/indexSecretary";
    }

    @RequestMapping("/addEvent")
    public String  AddEvent(){
        return "/secretary/indexSecretary";
    }



}
