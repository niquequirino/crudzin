package com.example.tiktok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages = "com.tiktok.user.model")
@SpringBootApplication
public class TiktokApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiktokApplication.class, args);
	}

}
