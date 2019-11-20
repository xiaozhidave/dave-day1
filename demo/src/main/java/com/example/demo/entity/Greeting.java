package com.example.demo.entity;

public class Greeting {

    private final long id;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
