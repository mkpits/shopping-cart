package com.example.shopingCart.ShopingCart_New.repository;

import com.example.shopingCart.ShopingCart_New.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Long> {

}
