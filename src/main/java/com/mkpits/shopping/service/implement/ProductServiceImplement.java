package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.repository.ProductRepository;
import com.mkpits.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Product getProductById(long id) {
        Optional<Product> optional = productRepository.findById(id);
        Product product;
//        Product product = null;

        if (optional.isPresent()) {

            product = optional.get();
        } else {
            throw new RuntimeException("Invalid product_id");

        }
        return product;

    }

    @Override
    public void deleteProductById(Long product_id) {
        this.productRepository.deleteById(product_id);
    }

    @Override
    @Transactional
    public int updateProductNameById(String name, Long id) {

        int updatedProduct = productRepository.updateProductById(name, id);

        return updatedProduct;
    }

    @Override
    @Transactional
    public int updateProductCategoryById(String category, Long id) {

        int updateProductCategory = productRepository.updateProductById2(category , id);

        return  updateProductCategory;

    }

    @Override
    @Transactional
    public int updateProductPriceById(Double price, Long id) {

      int updateProductPrice = productRepository.updateProductById3(price,id);

        return  updateProductPrice;
    }


}
