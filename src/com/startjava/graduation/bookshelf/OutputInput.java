package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class OutputInput {
    static final int ONE = 1;
    static final int TWO = 2;
    static final int TREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    private final Scanner console = new Scanner(System.in);

    public void printPressEnter() {
        System.out.println("Для продолжения работы нажмите Enter");
        console.nextLine();
    }

    public void printBooks(Book[] books, int countBook, int freeShelf) {
        System.out.printf("Шкаф содержит %s книги. Свободно — %s полок.%n", countBook, freeShelf);
        for(Book book : books) {
            if(book != null) {
                System.out.print(book);
            }
        }
        if(freeShelf > 0) {
            System.out.println((new Bookshelf()).getFreeShelf());
        }
    }

    public void printWelcome() {System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");}

    public void showMenu() {
        System.out.printf("""
                %s. Добавить книгу
                %s. Удалить книгу
                %s. Найти книгу
                %s. Очистить шкаф
                %s. Завершить
                %n""", ONE, TWO, TREE, FOUR, FIVE);
    }

    public int getAction() {
        System.out.print("Выберете действие: ");
        return console.nextInt();
    }

    public void doAction(int choice, Bookshelf bookshelf) {
        String message = "";
        console.nextLine();
        switch (choice) {
            case ONE -> {
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
            case TWO -> {
                System.out.println("Введите название книги");
                message = "Книга " + (bookshelf.del(console.nextLine()) ? "успешно удалена" : "не найдена");
            }
            case TREE -> {
                System.out.println("Введите название книги");
                Book book = bookshelf.find(console.nextLine());
                if(book == null) {
                    message = "Книга не найдена";
                } else {
                    System.out.println(book);
                }
            }
            case FIVE -> {System.out.println("Выход из программы");}
            case FOUR -> {
                message = "Все книги удалены";
                bookshelf.delAll();
            }
            default -> System.out.printf("Введите пункт меню от %s до %s%n", ONE, FIVE);
        }
        System.out.println(message);
    }
}
