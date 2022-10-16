package com.startjava.lesson_2_3_4.calculator;

import java.net.ServerSocket;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        char operation = partsExpression[1].charAt(0);
        int num1 =  checkNum(partsExpression, 0);
        int num2 = checkNum(partsExpression, 2);
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

    private static int checkNum(String[] parts, int index) {
        return Integer.parseInt(parts[index]);
    }
}
