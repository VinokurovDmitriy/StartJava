package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(int num1, int num2, char operation) {
        switch(operation) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return num1 / num2;
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                return 0;
        }
    }
}
