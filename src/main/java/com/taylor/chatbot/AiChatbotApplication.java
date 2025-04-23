package com.taylor.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This annotation marks it as the main Spring Boot application class
@RestController
public class AiChatbotApplication {

    @Autowired
    private ChatbotService chatbotService;

    @GetMapping("/api/chat")
    public String chat(@RequestParam String message) {
        return chatbotService.getResponse(message);
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to the AI Chatbot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AiChatbotApplication.class, args); // This starts the Spring Boot application
    }
}


