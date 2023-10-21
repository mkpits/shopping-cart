package com.mkpits.shopping.controller;


import com.mkpits.shopping.model.User;
import com.mkpits.shopping.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    public User myUserMethod(@RequestBody User user) {

        return userRepo.save(user);


    }
}
