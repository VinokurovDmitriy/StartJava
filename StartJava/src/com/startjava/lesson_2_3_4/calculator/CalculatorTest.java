package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.StringIndexOutOfBoundsException;

public class CalculatorTest {

    static final String SUCCESS = "success";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String reply = "yes";
        while(!reply.equals("no")) {
            if(reply.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = getMatExpression(console);
                System.out.println(mathExpression + " = " + Calculator.calculate(mathExpression));
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = console.nextLine();
        }
    }

    private static String getMatExpression(Scanner console) {
        String correct = "";
        String mathExpression = "";
        while(!correct.equals(SUCCESS)) {
            mathExpression = console.nextLine();
            correct = Calculator.checkExpression(mathExpression);
            if(!correct.equals(SUCCESS)) System.out.print(correct);
        }
        return mathExpression;
    }
}
