package com.startjava.graduation.bookshelf;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        OutputInput outputInput = new OutputInput();
        int action;
        do {
            if(bookshelf.getCount() > 0) {
                int freeShelf = bookshelf.getCountFreeShelf();
                outputInput.printPressEnter();
                outputInput.printBooks(bookshelf.getBooks(),bookshelf.getCount(), freeShelf);
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
