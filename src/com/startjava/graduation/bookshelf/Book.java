package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String name;
    private final int year;

    Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {return name;}

    public String getAuthor() {return author;}

    public String toString() {
        return author + ", " + name + ", " + year;
    }
}
