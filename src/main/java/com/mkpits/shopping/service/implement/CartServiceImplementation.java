package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.repository.CartRepository;
import com.mkpits.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImplementation implements CartService {

   @Autowired
    CartRepository cartRepository;

    @Override
    public Product getProductById(long id) {

        Optional <Product> optional = cartRepository.findById(id);
        Product product;

        if (optional.isPresent()){

            product = optional.get();

        }
        else {
            throw new RuntimeException("Invalid Product_ID");
        }

        return product;
    }

    @Override
    public void saveProduct(Product product) {

        this.cartRepository.save(product);
    }
}
