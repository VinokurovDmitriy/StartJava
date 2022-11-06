package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OutputInput {
    private static final int ADD = 1;
    private static final int DEL = 2;
    private static final int FIND = 3;
    private static final int DEL_ALL = 4;
    static final int EXIT = 5;
    private final Scanner console = new Scanner(System.in);

    public void printPressEnter() {
        System.out.println("Для продолжения работы нажмите Enter");
        console.nextLine();
    }

    public void printBookshelf(Book[] books, int countBook, int freeShelf) {
        System.out.printf("Шкаф содержит %s книги. Свободно — %s полок.%n%n", countBook, freeShelf);
        for(Book book : books) {
            printBook(book);
        }
        if(freeShelf > 0) {System.out.println("|" + " ".repeat(80) + "|");}
    }

    public void printWelcomeMsg() {System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");}

    public void showMenu() {
        System.out.printf("""
                %n
                %s. Добавить книгу
                %s. Удалить книгу
                %s. Найти книгу
                %s. Очистить шкаф
                %s. Завершить
                %n""", ADD, DEL, FIND, DEL_ALL, EXIT);
    }

    public int selectAction(Bookshelf bookshelf) {
        int action = 0;
        System.out.print("Выберете действие: ");
        try {
            action = console.nextInt();
            doAction(action, bookshelf);
        } catch (InputMismatchException ignored){}
        return action;
    }

    public void doAction(int action, Bookshelf bookshelf) {
        String message = "";
        console.nextLine();
        switch (action) {
            case ADD -> {
                message = "Освободите место на полке для добавления новой книги";
                if(bookshelf.getCountFreeShelf() > 0) {
                    System.out.print("Введите имя автора: ");
                    String author = console.nextLine();
                    System.out.print("Введите название книги: ");
                    String name = console.nextLine();
                    System.out.print("Введите год издания: ");
                    int year = console.nextInt();
                    console.nextLine();
                    bookshelf.add(new Book(author, name, year));
                    message = "Книга успешно добавлена";
                }
            }
            case DEL -> {
                System.out.println("Введите название книги");
                message = "Книга " + (bookshelf.del(console.nextLine()) ? "успешно удалена" : "не найдена");
            }
            case FIND -> {
                System.out.println("Введите название книги");
                Book book = bookshelf.find(console.nextLine());
                if(book == null) {
                    message = "Книга не найдена";
                } else {
                    printBook(book);
                }
            }
            case DEL_ALL -> {
                message = "Все книги удалены";
                bookshelf.delAll();
            }
            case EXIT -> System.out.println("Выход из программы");
            default -> System.out.printf("Введите пункт меню от %s до %s%n", ADD, EXIT);
        }
        System.out.println(message);
    }

    void printBook(Book book) {
        System.out.printf("""
                |%-80s|
                |%s|
                """.formatted(book, "-".repeat(80)));
    }
}
