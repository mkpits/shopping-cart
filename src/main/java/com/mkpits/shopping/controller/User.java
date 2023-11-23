package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Address;
import com.mkpits.shopping.model.UserEntity;
import com.mkpits.shopping.service.AddressService;
import com.mkpits.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class User {
    private UserService userService;
    private AddressService addressService;

    @GetMapping("/")
    public String index()
    {
        return "index";

    }
    @GetMapping("/registerUser")
    public String registerUser(Model model){
        UserEntity userEntity=new UserEntity();
        Address address=new Address();
        model.addAttribute("address",address);
        model.addAttribute("user",userEntity);
        return "register";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserEntity userEntity , @ModelAttribute("address") Address address){
        userService.createUser(userEntity);
        addressService.saveAddress(address);
        return "/index";

    }


}


