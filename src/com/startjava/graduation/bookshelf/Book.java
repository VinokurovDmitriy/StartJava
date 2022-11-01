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
    @Override
    public String toString() {
        return """
                ----------------------------------------------------------------------------
                           %s                      %s                      %s               
                ----------------------------------------------------------------------------
                """.formatted(author, name, year);

    }

    public String getAuthor() {return author;}

    public String getName() {return name;}

    public int getYear() {
        return year;
    }
}
