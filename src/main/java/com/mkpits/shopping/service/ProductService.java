package com.mkpits.shopping.service;

import com.mkpits.shopping.model.Product;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void saveProduct(Product product);

    Product getProductById(long id);//update the product

    void deleteProductById(Long product_id);

    int updateProductNameById(String name, Long id);

    int updateProductCategoryById(String category , Long id);

   int updateProductPriceById(Double price , Long id);



}
