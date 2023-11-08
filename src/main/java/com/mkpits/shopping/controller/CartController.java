//package com.mkpits.shopping.controller;
//
//import com.mkpits.shopping.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class CartController {
//
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/")
//    public String viewPage(Model model) {
//
//        model.addAttribute("listProduct",productService.getAllProducts());
//        return "productnew";
//
//    }
//
//}
