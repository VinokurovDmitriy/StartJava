package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.StringIndexOutOfBoundsException;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reply = "yes";
        while(!reply.equals("no")) {
            if(reply.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                System.out.println(mathExpression + " = " + Calculator.calculate(mathExpression));
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = scanner.nextLine();
        }
    }
}
