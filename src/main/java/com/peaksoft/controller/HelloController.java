package com.peaksoft.controller;

import com.peaksoft.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloController {
    @GetMapping
    public String ali(){
        return "views/ali";
    }
    @GetMapping("/addUser")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "views/saveUser";
    }

    @PostMapping("/saveUser")
    public void save(@ModelAttribute("user") User user) {
        System.out.println(user);
    }
}
