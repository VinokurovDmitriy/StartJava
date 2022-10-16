package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String reply = "yes";
        while(!reply.equals("no")) {
            if(reply.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                boolean correct = false;
                int result = 0;
                String mathExpression = "";
                while(!correct) {
                    mathExpression = console.nextLine();
                    try {
                        result = Calculator.calculate(mathExpression);
                        correct = true;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print("Введите число, знак операции и второе число через пробел: ");
                    } catch (NumberFormatException e) {
                        System.out.println("Введите числа корректно: ");
                    } catch (NegativeNumber ignored) {}
                }
                System.out.println(mathExpression + " = " + result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = console.nextLine();
        }
    }
}
