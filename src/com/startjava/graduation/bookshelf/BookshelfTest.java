package com.startjava.graduation.bookshelf;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        OutputInput outputInput = new OutputInput();
        int action;
        do {
            if(bookshelf.getCountBooks() > 0) {
                for(Book book : bookshelf.getBooks()) {
                    System.out.println(book);
                }
                outputInput.printPressEnter();
            } else {
                outputInput.printWelcome();
            }
            outputInput.showMenu();
            action = outputInput.getAction();
            outputInput.doAction(action);
        }
        while(action != 5);

    }
}
