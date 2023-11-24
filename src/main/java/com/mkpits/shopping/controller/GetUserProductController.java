package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.service.GetUserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GetUserProductController{

    @Autowired
    GetUserProductService getUserProductService;

    @GetMapping("/userPage")
    public String viewUserHomePage(Model model){

        model.addAttribute("listProductUser", getUserProductService.getAllProduct());

        return "getAllProduct_ToUser";


//        @GetMapping("/showFormForUpdate/{id}")
//        public String showFormForUpdate(@PathVariable(value = "id") Long product_id, Model model) {
//
//            System.out.println("Start");
//            Product product = productService.getProductById(product_id);
//            model.addAttribute("product", product);
//
//            return "update_product";

//        adding method like update in that make readonly tags make a logic of price x Quantity by Js


//        }
    }
}
