package com.taylor.chatbot;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    // Simple predefined responses based on user input
    public String getResponse(String message) {
        if (message.toLowerCase().contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (message.toLowerCase().contains("bye")) {
            return "Goodbye! Have a great day!";
        } else if (message.toLowerCase().contains("how are you")) {
            return "I'm just a bot, but I'm doing great! How about you?";
        } else {
            return "Sorry, I don't understand that. Can you ask something else?";
        }
    }
}

