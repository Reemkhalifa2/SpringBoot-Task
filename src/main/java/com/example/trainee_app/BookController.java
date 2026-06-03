package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class BookController {
    private static ArrayList<Book> bookshelf = new ArrayList<>();

    @GetMapping("/add-book")
    public String addBook(@RequestParam int id,
                          @RequestParam String name) {
        Book book = new Book(id, name);
        bookshelf.add(book);
        return "Book added successfully!";
    }



}
