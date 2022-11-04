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
        String info = author + ", " + name + ", " + year;
        return """
                |%-80s|    
                ----------------------------------------------------------------------------------
                """.formatted(info);
    }

    public String getName() {return name;}
}
