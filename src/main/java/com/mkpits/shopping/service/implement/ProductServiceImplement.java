package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.repository.ProductRepository;
import com.mkpits.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {

        this.productRepository.save(product);
    }
}
