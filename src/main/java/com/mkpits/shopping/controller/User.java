package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Address;
import com.mkpits.shopping.model.UserEntity;
import com.mkpits.shopping.repository.UserRepository;
import com.mkpits.shopping.service.AddressService;
import com.mkpits.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class User {

    @Autowired

    private UserService userService;
    @Autowired
    private AddressService addressService;

    @GetMapping("/")
    public String index() {
        return "index";

    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/registerUser")
    public String registerUser(Model model) {
        UserEntity userEntity = new UserEntity();
        Address address = new Address();
        model.addAttribute("address", address);
        model.addAttribute("user", userEntity);
        return "register";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserEntity userEntity, @ModelAttribute("address") Address address) {
        userService.createUser(userEntity);
        addressService.saveAddress(address);
        return "/index";
    }

    @PostMapping("/check-login")
    public String userLogin(@RequestParam("email") String email) {


        if (userService.findUserByUsername(email)){
            return "dashboard";
        }
        else
            return "index";

    }
}