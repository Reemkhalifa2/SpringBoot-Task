package com.example.trainee_app;

public class InventoryBook {

    public InventoryBook(int id, String title, double price, int stockCount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.stockCount = stockCount;
    }



    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private String title;
    private double price;
    private int stockCount;


}
