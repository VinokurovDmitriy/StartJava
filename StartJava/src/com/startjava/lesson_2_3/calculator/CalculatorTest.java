package com.startjava.lesson_2_3.calculator;

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
                float num1 = inputNum("первое", scanner);
                char operation = inputOperation(scanner);
                float num2 = inputNum("второе", scanner);
                float result = calculator.calculate(num1, num2, operation);
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = scanner.nextLine();
        }
    }

    private static float inputNum(String index, Scanner scanner) {
        boolean correct = false;
        float num = 0f;
        while (!correct) {
            System.out.print("Введите " + index + " число: ");
            try {
                num = scanner.nextFloat();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно " + index + " число");
                scanner.nextLine();
            }
        } 
        return num;
    }

    private static char inputOperation(Scanner scanner) {
        char operation = ' ';
        boolean correct = false;
        System.out.print("Введите знак (+, -, *, /, ^ или %): ");
        while(!correct) {
            try {
                operation = scanner.nextLine().charAt(0);
                correct = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Введите знак операции корректно");
            }
        }
        return operation;
    }
}
