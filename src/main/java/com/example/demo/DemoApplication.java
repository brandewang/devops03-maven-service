package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // 添加这个注解

public class DemoApplication {

    // 添加一个简单的 REST 端点
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
