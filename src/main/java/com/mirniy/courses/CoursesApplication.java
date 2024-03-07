package com.mirniy.courses;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        servers = {
                @Server(url = "https://alexeymirniy.ru/", description = "Default Server URL")
        }
)
@SpringBootApplication
public class CoursesApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);
    }
}
