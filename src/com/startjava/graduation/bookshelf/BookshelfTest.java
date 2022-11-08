package com.startjava.graduation.bookshelf;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        OutputInput outputInput = new OutputInput();
        int action;
        do {
            if(bookshelf.getCount() > 0) {
                outputInput.printPressEnter();
                outputInput.printBookshelf(bookshelf);
            } else outputInput.printWelcomeMsg();
            outputInput.showMenu();
            action = outputInput.selectAction(bookshelf);
        } while (action != OutputInput.EXIT);
    }
}
