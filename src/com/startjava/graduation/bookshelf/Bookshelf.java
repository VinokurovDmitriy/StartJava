package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int length;
    private static final int LIMIT = 10;
    private int count;
    private final Book[] books = new Book[LIMIT];

    public int getCount() {return count;}

    public Book[] getBooks() {return Arrays.copyOf(books, count);}

    public int getLength() {
        return length;
    }

    public void add(Book book) {
        if(count < LIMIT) {
            books[count] = book;
            count++;
            setLength();
        }
    }

    public boolean del(String name) {
        int index = findIndex(name);
        if(index >= 0) {
            books[count] = null;
            if(index < LIMIT - 1) {
                System.arraycopy(books, index + 1, books, index, count - index - 1);
            }
            count--;
            setLength();
            return true;
        }
        return false;
    }

    public Book find(String name) {
        int index = findIndex(name);
        return index >= 0 ? books[index] : null;
    }

    public void delAll() {
        Arrays.fill(books, 0, count,null);
        count = 0;
    }

    public int getCountFreeShelf() {return LIMIT - count;}

    private int findIndex(String name) {
        for(int i = 0; i < count; i++) {
            if(books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private void setLength() {
        int length = 0;
        for(int i = 0; i < count; i++) {
            int shelfLength = books[i].toString().length();
            if(shelfLength > length) {
                length = shelfLength;
            }
        }
        this.length = length;
    }

}
