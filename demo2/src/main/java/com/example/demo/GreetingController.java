package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/api/greeting")
    public Map<String,String> greet(@RequestParam(defaultValue = "Guest") String name){
        Map<String,String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        return response;
    }

}
