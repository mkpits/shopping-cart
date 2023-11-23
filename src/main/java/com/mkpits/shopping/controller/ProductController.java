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
    public String viewHomePage(Model model) {

        model.addAttribute("listProduct", productService.getAllProducts());
        return "product";

    }

    @GetMapping("/showNewProductForm")
    public String showNewProduct(Model model) {

        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";

    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {

        productService.saveProduct(product);
        return "redirect:/product";

    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long product_id, Model model) {

        System.out.println("Start");
        Product product = productService.getProductById(product_id);
        model.addAttribute("product", product);

        return "update_product";
    }

    @PostMapping("/updateProductName")
    public String updateProductName(@ModelAttribute("product") Product product) {

        String name = product.getName();
        String category = product.getCategory();
        Double price = product.getPrice();

        Long id = product.getProduct_id();
        System.out.println(" " + name);
        System.out.println("" + id);
        System.out.println(" "+category);
        System.out.println(" "+price);

        String returnValue = "";

        int result = productService.updateProductNameById(name, id);
        int result2 = productService.updateProductCategoryById(category,id);
        double result3 = productService.updateProductPriceById(price,id);

        if (result > 0 && result2 > 0 && result3 > 0) {
            System.out.println("Product name updated successfully");
            returnValue = "redirect:/product";
        } else {
            returnValue = "index";
        }

        return returnValue;
    }


    // /showFormForUpdate/{id}

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable(value = "id") Long product_id) {

        this.productService.deleteProductById(product_id);

        return "redirect:/product";
    }

}
