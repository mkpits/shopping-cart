package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Product , Long> {
}
