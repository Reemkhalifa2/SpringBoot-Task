package com.example.trainee_app;

public class Book {
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



}
