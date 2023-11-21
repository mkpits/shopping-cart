package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface GetUserProductRepo extends JpaRepository<Product, Long> {
}
