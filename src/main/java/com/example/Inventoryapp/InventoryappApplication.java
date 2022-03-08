package com.example.Inventoryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("my.package.base.*")
//@ComponentScan(basePackages = { "my.package.base.*" })
@EntityScan("com.example.Inventoryapp.*")   
public class InventoryappApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryappApplication.class, args);
	}

}
