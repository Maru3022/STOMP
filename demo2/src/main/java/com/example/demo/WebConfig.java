package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Применить CORS ко всем путям
                .allowedOriginPatterns("*") // Разрешить все источники (включая null-Origin)
                .allowedMethods("*") // Разрешить все методы (GET, POST, и т.д.)
                .allowedHeaders("*") // Разрешить все заголовки
                .allowCredentials(true); // Разрешить передачу куки и авторизации
    }
}