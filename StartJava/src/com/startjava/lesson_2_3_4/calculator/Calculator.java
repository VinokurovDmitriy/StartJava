package com.startjava.lesson_2_3_4.calculator;

import java.net.ServerSocket;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] partsExpression = splitInput(mathExpression);
        char operation = partsExpression[1].charAt(0);
        int num1 = getNum(partsExpression, 0);
        int num2 = getNum(partsExpression, 2);
        return switch (operation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> num1 / num2;
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> 0;
        };
    }

    public static String checkExpression(String mathExpression) {
        String[] partsExpression = splitInput(mathExpression);
        try {
            int num1 = getNum(partsExpression, 0);
            int num2 = getNum(partsExpression,2);
            return (num1 > 0 && num2 > 0) ?
                    "success" : "Введите положительные целые числа: ";
        } catch (NumberFormatException e) {
            return "Введите целые числа: ";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Введите число знак и второе число через пробел: ";
        }
    }

    private static String[] splitInput(String input) {
        return input.split(" ");
    }

    private static int getNum(String[] parts, int index) {
        return Integer.parseInt(parts[index]);
    }
}
