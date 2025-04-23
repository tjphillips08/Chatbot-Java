package com.taylor.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This annotation marks it as the main Spring Boot application class
@RestController
public class AiChatbotApplication {

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to the AI Chatbot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AiChatbotApplication.class, args); // This starts the Spring Boot application
    }
}


