package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private final int LIMIT = 10;
    private int count;
    private Book[] books = new Book[LIMIT];

    public int getCount() {return count;}

    public Book[] getBooks() {return Arrays.copyOf(books, LIMIT);}

    public void add(Book book) {
        if(count < LIMIT) {
            books[count] = book;
            count++;
        }
    }

    public boolean del(String name) {
        for(int i = 0; i < count; i++) {
            if(books[i].getName().equals(name)) {
                System.arraycopy(books, i + 1, books, i, getCountFreeShelf() + 1);
                count--;
                return true;
            }
        }
        return false;
    }

    public Book find(String name) {
        for(int i = 0; i < count; i++) {
            if(books[i].getName().equals(name)) {
                return books[i];
            }
         }
        return null;
    }

    public void delAll() {
        Arrays.fill(books, null);
        count = 0;
    }

    public int getCountFreeShelf() {return LIMIT - count;}

    public String getFreeShelf() {return "|" + " ".repeat(80) + "|";}
}
