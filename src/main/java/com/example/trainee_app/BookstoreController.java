package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookstoreController {

    static List<InventoryBook> catalog = new ArrayList<>();

    @GetMapping("/addInventoryBook")

    public String InventoryBook(@RequestParam int id, String title, double price , int stockCount){
        InventoryBook inventoryBook = new InventoryBook(id,title,price,stockCount);
        for(InventoryBook i :  catalog){
            if(i.getId() == inventoryBook.getId()){
                return "Book Already exist";
            }
        }
        catalog.add(inventoryBook);
        return "Book successfully added to the bookstore's catalog";

    }

}
