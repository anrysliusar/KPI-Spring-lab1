package com.example.springlab1_2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class SpringLab12Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main");
        SpringApplication.run(SpringLab12Application.class, args);
        System.out.println("End of main");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot");
    }
}
