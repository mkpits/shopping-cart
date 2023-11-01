//package com.mkpits.shopping.configure;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//public class JpaConfigNew {
//
//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactory.setDataSource(dataSource);
//        entityManagerFactory.setPackagesToScan("com.mkpits.shopping.controller.Login");
//
//        // Set the JPA vendor adapter to Hibernate
//        entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//
//        // Configure JPA properties
//        Properties jpaProperties = new Properties();
//        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect"); // Set  database dialect
//        jpaProperties.setProperty("hibernate.show_sql", "true"); // Enable SQL logging
//        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update"); // Auto-generate/validate the database schema
//
//        entityManagerFactory.setJpaProperties(jpaProperties);
//
//        return entityManagerFactory;
//    }
//}