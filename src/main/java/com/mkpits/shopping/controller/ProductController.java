package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id")Long prduct_id ,Model model){

    Product product = productService.getProductById(prduct_id);

    model.addAttribute("product",product);

    return "update_product";

    }
   // /showFormForUpdate/{id}

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable(value = "id")Long prduct_id){

        this.productService.deleteProductById(prduct_id);

        return "redirect:/product";
    }

    @GetMapping("/showLoginPage")
    public String redirectPage(){

        return "register";
        /// redirect to login page;
    }

    @GetMapping("/redirectToAdminPage")
    public String redirectoAdminPage(){
        return "product";
        // redirect of admin to productPAge
    }
    @GetMapping("/redirectToUserLoginPage")
    public String redirectToUser(){
        return "login";

        // redirect of user to user login
    }
    @GetMapping("/mainPage")
    public String mainPage(){
        return "dashboard";
        // opening mainPage
    }
}
