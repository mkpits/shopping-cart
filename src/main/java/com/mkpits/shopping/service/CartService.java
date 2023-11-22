package com.mkpits.shopping.service;

import com.mkpits.shopping.model.Product;

public interface CartService {

    Product getProductById(long id);

    void  saveProduct(Product product);
}
