package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.StringIndexOutOfBoundsException;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String reply = "yes";
        while(!reply.equals("no")) {
            if(reply.equals("yes")){
                System.out.print("Введите математическое выражение: ");
                String[] mathExpression = scanner.nextLine().split(" ");
                int num1 = Integer.parseInt(mathExpression[0]);
                int num2 = Integer.parseInt(mathExpression[2]);
                char operation = mathExpression[1].charAt(0);
                float result = calculator.calculate(num1, num2, operation);
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = scanner.nextLine();
        }
    }
}
