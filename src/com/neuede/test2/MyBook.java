package com.neuede.test2;

public class MyBook {
    private String name;
    private double price;
    private String press;
    private String author;
    private String bookIsbn;

    public MyBook(String name, double price, String press, String author, String bookIsbn) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookIsbn = bookIsbn;
    }

    public MyBook() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
}
