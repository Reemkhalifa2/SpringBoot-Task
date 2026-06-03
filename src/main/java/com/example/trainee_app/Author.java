package com.example.trainee_app;

public class Author {
    private Integer id;
    private String name;

    public Author(Integer id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }

    private String biography;
}
