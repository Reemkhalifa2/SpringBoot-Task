package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private static List<Author> authorList = new ArrayList<>();
    private static List<Book> bookList = new ArrayList<>();

    @GetMapping("/addAuthor")
    public String addAuthor(@RequestParam int id, String name, String biography){
        Author author = new Author(id,name,biography);
        authorList.add(author);
        return "Author Added Successfully";

    }

    @GetMapping("/allAuthors")
    public List<Author> getAuthers(){
        return authorList;
    }


    @GetMapping("/addRelationalbook")
    public String addRelationalBook(@RequestParam int id, String name,int authorId) {
        boolean authorExists = false;

        for (Author author : authorList) {
            if (author.getId() == authorId) {
                authorExists = true;
            }
        }

        if (authorExists) {
            Book book = new Book(id, name, authorId);
            bookList.add(book);
            return "Book added successfully";
        } else {
            return "Author ID does not exist";
        }
    }

    @GetMapping("/authorReport")
    public String authorReport(@RequestParam String name) {

        Author author = null;

        for (Author a : authorList) {
            if (a.getName().equalsIgnoreCase(name)) {
                author = a;
            }
        }

        if (author == null) {
            return "Author name does not exist";
        }

        String booksTitle = "";

        for (Book b : bookList) {
            if (b.getAuthorId().equals(author.getId())) {
                booksTitle += b.getName() + " , ";
            }
        }

        return "ID: " + author.getId()
                + " Name: " + author.getName()
                + " Books: " + booksTitle;
    }



}
