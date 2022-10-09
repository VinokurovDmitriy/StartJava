package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public float calculate(float num1, float num2, char operation) {
        switch(operation) {
            case '+': 
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                float result = num1;
                for(int i = 2; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
        }
        return 0f;
    }
}
