package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ChatController {
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/messages")
    public Map<String,String> sendMessage(Map<String,String> message){
        String sender = message.getOrDefault("sender","Unknown");
        String content = message.getOrDefault("content", "Empty message");
        String timestamp = LocalTime.now().format(timeFormatter);

        Map<String,String> output = new HashMap<>();
        output.put("sender", sender);
        output.put("content", content);
        output.put("timestamp", timestamp);

        return output;
    }
}
