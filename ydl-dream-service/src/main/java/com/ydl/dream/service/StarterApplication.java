package com.ydl.dream.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication("classpath:spring-context.xml", StarterApplication.class);
		application.run(args);
	}

}
