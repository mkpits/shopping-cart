//package com.mkpits.shopping.controller;
//
//import com.mkpits.shopping.service.GetUserProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class GetUserProductController {
//
//    @Autowired
//    GetUserProductService getUserProductService;
//
//    @GetMapping("/userPage")
//    public String viewUserHomePage(Model model){
//        model.addAttribute("listProductUser",getUserProductService.getAllProduct());
//        return "getAllProduct_ToUser";
//    }
//
//
//}
