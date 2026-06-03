package com.example.trainee_app;

public class Author {


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

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }


    public Author(Integer id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }
    private String name;
    private String biography;
    private Integer id;
}
