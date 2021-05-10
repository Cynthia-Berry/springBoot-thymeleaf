package com.example.form.controller;


import com.example.form.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


    @GetMapping(value = "/user-register")
    public String showUser(Model model) {
        User users = new User();
        model.addAttribute("users",users);
        return "userPage";
    }

    @PostMapping(value = "/user-details")
    public String createUser(@RequestParam String name, 
    @RequestParam String school, @RequestParam String subject, @RequestParam String[] company,
    @RequestParam String[] fax, @RequestParam String[] location) {
        System.out.println(location[1]);
        System.out.println(fax[0]);
        return "index";
    }
}
