package com.startjava.graduation.bookshelf;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        OutputInput outputInput = new OutputInput();
        int action;
        do {
            if(bookshelf.getCountBooks() > 0) {
                int freeShelf = bookshelf.getCountFreeShelf();
                outputInput.printInfo(bookshelf.getCountBooks(), freeShelf);
                outputInput.printBooks(bookshelf.getBooks(), freeShelf);
                outputInput.printPressEnter();
            } else {
                outputInput.printWelcome();
            }
            outputInput.showMenu();
            action = outputInput.getAction();
            outputInput.doAction(action, bookshelf);
        }
        while(action != OutputInput.FIVE);

    }
}
