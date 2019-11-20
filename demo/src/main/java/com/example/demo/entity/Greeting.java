/**
 * @author dave
 * @version 1.0
 * @date 2019-11-20 14:53
 */
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
