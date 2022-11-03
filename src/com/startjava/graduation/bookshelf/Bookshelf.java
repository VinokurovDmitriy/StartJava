package com.startjava.graduation.bookshelf;

public class Bookshelf {

    private final int MAX_BOOKS = 10;
    private int countBooks;
    private Book[] books = new Book[MAX_BOOKS];

    public int getCountBooks() {return countBooks;}

    public Book[] getBooks() {return books;}

    public void addBook(Book book) {
        if(countBooks < MAX_BOOKS) {
            books[countBooks] = book;
            countBooks++;
        }
    }

    public boolean delBook(String name) {
        for(int i = 0; i < countBooks; i++) {
            if(books[i].getName().equals(name)) {
                System.arraycopy(books, i + 1, books, i, 1);
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String name) {
        for(Book book : books) {
            if(book != null && book.getName().equals(name)) {
                return book;
            }
         }
        return null;
    }

    public void delAllBooks() {
        books = new Book[MAX_BOOKS];
        countBooks = 0;
    }

    public int getCountFreeShelf() {return MAX_BOOKS - countBooks;}

    public static String getFreeShelf() {
        return "|" + " ".repeat(80) + "|";
    }
}
