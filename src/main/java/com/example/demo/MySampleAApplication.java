package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySampleAApplication {

	@GetMapping("/message")
	public String getMessage() {
		System.out.println("Hello World from GIT-15!!...");
		return "Hello World from GIT-15!!...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MySampleAApplication.class, args);
	}

}
