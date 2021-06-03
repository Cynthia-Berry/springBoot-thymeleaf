package com.example.form.controllers;


import com.example.form.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping(value = "/user-register")
    public String showUser(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "userPage";
    }

    @PostMapping(value = "/user-details")
    public String createUser(@ModelAttribute("user") User user){
        System.out.println(user);
        return "userResult";
    }
//    public String createUser(@RequestParam String name,
//    @RequestParam String school, @RequestParam String bestSubject, @RequestParam String[] companyName,
//    @RequestParam String[] faxNumber, @RequestParam String[] location) {
//        System.out.println(createUser(name, school, bestSubject, companyName, faxNumber, location));
//        return "userResult";
//    }
}
