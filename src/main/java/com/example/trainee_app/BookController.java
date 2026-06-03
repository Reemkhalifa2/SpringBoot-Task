package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.ArgumentAware;

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


    @GetMapping("/all-books")
    public ArrayList<Book> displayBooks(){
        return bookshelf;
    }

    @GetMapping("/find-byid")
    public Book findBook(@RequestParam int id){
        for(Book b : bookshelf){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    @GetMapping("/find-by-name")
    public Book findBookByName(@RequestParam String name){
        for(Book b : bookshelf){
            if(b.getName().equalsIgnoreCase(name) ){
                return b;
            }
        }
        return null;
    }

    @GetMapping("/search-msg")

    public String search(@RequestParam int id){
        for(Book b : bookshelf){
            if(b.getId() == id){
                return "Found: " + b.getName();
            }
        }
        return "Sorry, that book ID is not available.";

    }





}
