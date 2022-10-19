package com.mircoservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ImageCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageCatalogApplication.class, args);
	}

}
