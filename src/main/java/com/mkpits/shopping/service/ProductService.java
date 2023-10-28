package com.mkpits.shopping.service;

import com.mkpits.shopping.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void saveProduct(Product product);
}
