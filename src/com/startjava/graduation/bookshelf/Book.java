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
                |     %25.25s       %25.25s       %4.4s       |    
                ----------------------------------------------------------------------------------
                """.formatted(author, name, year);
    }

    public String getName() {return name;}
}
