package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.ArgumentAware;

import java.util.ArrayList;


@RestController
public class BookController {
    private static ArrayList<Book> bookshelf = new ArrayList<>();

    @GetMapping("/addBook")
    public String addBook(@RequestParam int id,
                          @RequestParam String name,
                          @RequestParam int authorId) {
        Book book = new Book(id, name,authorId);
        bookshelf.add(book);
        return "Book added successfully!";
    }


    @GetMapping("/allBooks")
    public ArrayList<Book> displayBooks(){
        return bookshelf;
    }

    @GetMapping("/findById")
    public Book findBook(@RequestParam int id){
        for(Book b : bookshelf){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    @GetMapping("/findByName")
    public Book findBookByName(@RequestParam String name){
        for(Book b : bookshelf){
            if(b.getName().equalsIgnoreCase(name) ){
                return b;
            }
        }
        return null;
    }

    @GetMapping("/searchMsg")
    public String search(@RequestParam int id){
        for(Book b : bookshelf){
            if(b.getId() == id){
                return "Found: " + b.getName();
            }
        }
        return "Sorry, that book ID is not available.";

    }







}
