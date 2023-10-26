package com.mkpits.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Login {

    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
