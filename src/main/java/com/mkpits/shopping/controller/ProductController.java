package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/product")
    public String viewHomePage(Model model){

        model.addAttribute("listProduct",productService.getAllProducts());
        return "product";

    }
@GetMapping("/showNewProductForm")
    public String showNewProduct(Model model){

    Product product = new Product();
    model.addAttribute("product",product);
    return "new_product";

    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product")Product product){

        productService.saveProduct(product);
        return "redirect:/product";

    }


}
