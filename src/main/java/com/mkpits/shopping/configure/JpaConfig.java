//package com.mkpits.shopping.configure;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class JpaConfig {
//
//    @Bean(name = "entityManagerFactoryNew")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactory.setDataSource(dataSource);
//        entityManagerFactory.setPackagesToScan("com.mkpits.shopping.controller.Login");
//       // entityManagerFactory.setPackagesToScan("com.mkpits.shopping.model.UserEntity");
//
//        // Other JPA properties and settings can be configured here
//
//        return entityManagerFactory;
//    }
//}
