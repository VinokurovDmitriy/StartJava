package com.startjava.lesson_2_3_4.calculator;

import java.net.ServerSocket;
import java.util.Scanner;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] expressionArr = mathExpression.split(" ");
        boolean correct = false;
        int num1 = 0;
        int num2 = 0;
        while(!correct) {
            try {
                num1 = Integer.parseInt(expressionArr[0]);
                num2 = Integer.parseInt(expressionArr[2]);
                if(num1 > 0 && num2 > 0) {
                    correct = true;
                } else {
                    System.out.print("Введите положительные целые числа: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Введите целые числа: ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("Введите число знак и второе число через пробел: ");
            }
            if(!correct) {
                expressionArr = (new Scanner(System.in)).nextLine().split(" ");
            }
        }
        char operation = expressionArr[1].charAt(0);
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
}
