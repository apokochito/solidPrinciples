package com.principles.sr;

public class Book {

    // Single Responsibility
    // Only one job to do

    public String title;
    public String author;
    public int stock = 0;

    public void sold() {
        if (stock > 0) {
            stock--;
        }
    }

    // But how many responsibilities? 3 aprox

    public int getStock() {
        return stock;
    }

    public void addStock(int quantity) {
        stock = stock + quantity;
    }

    public void deleteStock(int quantity) {
        stock = stock - quantity;
    }

    // Mixing responsibilities also makes the class harder to understand and harder to test, decreasing cohesion.

}
