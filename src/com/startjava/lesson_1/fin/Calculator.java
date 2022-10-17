package com.startjava.lesson_1.fin;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = inputNum("первое", scanner);
        float num2 = inputNum("второе", scanner);
        boolean operationIsCorrect;
        float quotient = 0;
        char operation = ' ';
        float result = 0;
        do {
            operationIsCorrect = true;
            System.out.print("Введите знак (+, -, *, /, ^ или %): ");
            try {
                operation = (char) System.in.read();
            } catch(java.io.IOException e) {
                System.out.println("Введите символ из списка");
            }

            switch(operation) {
                case '+': 
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0) {
                        result =  num1 / num2;
                    } else {
                       System.out.println("Вы ввели второе число 0 и выбрали знак /. Делить на 0 нельзя");
                       operationIsCorrect = false;
                    }
                    break;
                case '^':
                    result = num1;
                    for(int i = 2; i <= num2; i++) {
                        result *= num1;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Введите знак корректно");
                    operationIsCorrect = false;
            }
        } while(!operationIsCorrect);

        if(operation == '/' && num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
    }

    private static float inputNum(String index, Scanner scanner) {
        boolean numIsCorrect = false;
        float num = 0f;
        while (!numIsCorrect) { 
            System.out.print("Введите " + index + " число: ");
            try {
                num = scanner.nextFloat();
                numIsCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно " + index + " число");
                scanner.nextLine();
            }
        } 
        return num;
    }      
}
