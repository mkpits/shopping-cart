package com.mkpits.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class ShopingCartNewApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopingCartNewApplication.class, args);
	}
}
