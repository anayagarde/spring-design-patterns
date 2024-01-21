package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SpringBootCustomerShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomerShareApplication.class, args);
	}

}
