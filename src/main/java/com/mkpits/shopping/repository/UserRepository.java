package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
@Repository
//@
//@org.springframework.beans.factory.annotation.Autowired(required=true)


public abstract interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public abstract UserEntity findByEmail(String email);
    //@EnableJpaRepositories(basePackages = "com.mkpits.shopping.repository")

}
