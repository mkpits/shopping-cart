package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.UserEntity;
import com.mkpits.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Login {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/checklogin")
    public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
        UserEntity userEntity= userRepository.findByEmail(email);
        if ((email.equals(userEntity.getEmail())) && (password.equals(userEntity.getPassword()))) {
            return "index";
        }
        else {
            return "redirect:/login";
        }
    }

}
