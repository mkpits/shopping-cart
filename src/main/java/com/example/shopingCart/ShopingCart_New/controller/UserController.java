package com.example.shopingCart.ShopingCart_New.controller;

import com.example.shopingCart.ShopingCart_New.model.Product;
import com.example.shopingCart.ShopingCart_New.model.User;
import com.example.shopingCart.ShopingCart_New.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
   private UserRepo userRepo;
    @PostMapping("/user")
    public User myUserMethod(@RequestBody User user){

        return userRepo.save(user);


    }
    private
    public Product myProductMethod(){

        return
    }
}
