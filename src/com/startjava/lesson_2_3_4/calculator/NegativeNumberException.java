package com.startjava.lesson_2_3_4.calculator;

public class NegativeNumberException extends RuntimeException {

    NegativeNumberException(int num1, int num2) {
        super("Введенные числа " + num1 + " и " + num2 + " должны быть положительными: ");
     }
}
