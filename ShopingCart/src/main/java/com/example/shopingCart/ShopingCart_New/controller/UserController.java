package com.example.shopingCart.ShopingCart_New.controller;

import com.example.shopingCart.ShopingCart_New.model.Role;
import com.example.shopingCart.ShopingCart_New.model.User;
import com.example.shopingCart.ShopingCart_New.repository.RoleRepo;
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
    @Autowired
    private RoleRepo roleRepo ;

    @PostMapping("/product")
    public Role myProductMethod(@RequestBody Role role){

        return roleRepo.save(role);

    }
}
