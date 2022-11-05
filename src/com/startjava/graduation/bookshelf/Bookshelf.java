package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int LIMIT = 10;
    private int count;
    private final Book[] books = new Book[LIMIT];

    public int getCount() {return count;}

    public Book[] getBooks() {return Arrays.copyOf(books, LIMIT);}

    public void add(Book book) {
        if(count < LIMIT) {
            books[count] = book;
            count++;
        }
    }

    public boolean del(String name) {
        int index = getIndex(name);
        if(index >= 0) {
            count--;
            books[index] = null;
            if(index < LIMIT - 1) {
                System.arraycopy(books, index + 1, books, index, count - index);
            }
            return true;
        }
        return false;
    }

    public Book find(String name) {
        int index = getIndex(name);
        if(index >= 0) {
            return books[index];
        }
        return null;
    }

    public void delAll() {
        Arrays.fill(books, 0, count,null);
        count = 0;
    }

    public int getCountFreeShelf() {return LIMIT - count;}

    private int getIndex(String name) {
        for(int i = 0; i < count; i++) {
            if(books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
