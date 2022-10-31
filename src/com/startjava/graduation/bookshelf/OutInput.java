package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class OutInput {

    private static Scanner console = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. Очистить шкаф
                5. Завершить
                """);
    }

    public static void printWelcome() {
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
    }

    public void printPressEnter() {
        System.out.println("Для продолжения работы нажмите Enter");
    }

    private String inputText() {
        return console.nextLine();
    }

    public static int getAction() {
        return console.nextInt();
    }

    public void action(int choice) {
        Bookshelf bookshelf = new Bookshelf();
        boolean complete = true;
        String message = "";
        switch (choice) {
            case 1 -> {
                System.out.println("Введите имя автора");
                String author = inputText();
                System.out.println("Введите название книги");
                String name = inputText();
                System.out.println("Введите год издания");
                int year = getAction();
                complete = bookshelf.addBook(new Book(author, name, year));
                message = "Книга успешно добавлена";
            }
            case 2 -> {
                complete = bookshelf.delBook(inputText());
                message = "Книга успешно удалена";
            }
            case 3 -> {
                Book book = bookshelf.findBook(inputText());
                complete = book != null;
                message = "Книга найдена";
            }
            case 4 -> {
                message = "Все книги удалены";
                bookshelf.delAllBooks();
            }
//            case '5' ->
        }
        printResultAction(complete, message);
    }

    private void printBook(Book book) {
        System.out.println(book);
    }

    private void printResultAction(boolean complete, String message) {
        System.out.println(complete ? message : "Книга не найдена");
    }
}
