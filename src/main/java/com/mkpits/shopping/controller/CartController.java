package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/showCartDetails/{id}")
    public String showCartDetails(@PathVariable(value = "id") Long product_id, Model model) {

        Product product = cartService.getProductById(product_id);

        model.addAttribute("product", product);

        return "cart";

    }

    @PostMapping("/buyProduct")
    public String buyProducts(@ModelAttribute("product")Product product,Model model){

//        cartService.saveProduct(product);
        model.getAttribute("product");

        return "buypage";
    }

}
