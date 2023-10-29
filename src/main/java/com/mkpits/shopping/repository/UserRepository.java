package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
//@org.springframework.beans.factory.annotation.Autowired(required=true)


public abstract class UserRepository implements JpaRepository<UserEntity,Integer> {

    public abstract UserEntity findByEmail(String email);
    //@EnableJpaRepositories(basePackages = "com.mkpits.shopping.repository")

}
