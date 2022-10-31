package com.startjava.graduation.bookshelf;

public class Bookshelf {

    private final int MAX_BOOKS = 10;
    private int countBooks;
    private Book[] bookshelf = new Book[MAX_BOOKS];

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public boolean addBook(Book book) {
        if(countBooks < MAX_BOOKS - 1) {
            bookshelf[countBooks] = book;
            countBooks++;
            return true;
        }
        return false;
    }

    public Book findBook(String name) {
        for(Book book : bookshelf) {
            if(book.getName().equals(name)) {
                return book;
            }
         }
        return null;
    }

    public boolean delBook(String name) {
        for(int i = 0; i < bookshelf.length; i++) {
            if(bookshelf[i].getName().equals(name)) {
                System.arraycopy(bookshelf, i + 1, bookshelf, i, 1);
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public Book[] getBooks() {
        Book[] books = new Book[countBooks];
        System.arraycopy(bookshelf, 0, books, 0, countBooks);
        return books;
    }

    public int getFreePlaces() {
        return MAX_BOOKS - countBooks -1;
    }

    public void delAllBooks() {
        bookshelf = new Book[MAX_BOOKS];
        countBooks = 0;
    }
}
