package com.example.demo;

public class EchoMessage {
    private String content;

    public EchoMessage() {} // нужен пустой конструктор для сериализации

    public EchoMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
