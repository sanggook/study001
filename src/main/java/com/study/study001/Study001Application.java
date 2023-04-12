package com.study.study001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Study001Application {

	public static void main(String[] args) {
		SpringApplication.run(Study001Application.class, args);
	}

}
