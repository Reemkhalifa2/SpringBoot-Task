package com.example.trainee_app;

public class Book {
    private Integer id;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    private Integer authorId;
    private String name;
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


    public Book(Integer id, String name, Integer authorId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
    }



}
