package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@EnableJpaRepositories(basePackages = "com.mkpits.shopping.repository")
//@EnableTransactionManagement
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Modifying
    @Query("update product_new p set p.name = :name where p.product_id = :id")
    int updateProductById(@Param("name") String name, @Param("id") Long id);

//   changes  category price updatedAt

    @Modifying
    @Query("update product_new p set p.category = :category where p.product_id = :id")
    int updateProductById2(@Param("category") String category ,@Param("id") Long id);

    @Modifying
    @Query("update product_new p set p.price = :price where p.product_id = :id")
    int updateProductById3(@Param("price") Double price , @Param("id")Long id);

}
