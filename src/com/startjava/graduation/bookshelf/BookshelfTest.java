package com.startjava.graduation.bookshelf;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        while(OutInput.getAction() != 5) {
            if(bookshelf.getCountBooks() > 0) {
                System.out.println(111111111);
                bookshelf.getBooks();
            } else {
                System.out.println(222222222);
                OutInput.printWelcome();
            }
            OutInput.showMenu();
        }

    }
}
