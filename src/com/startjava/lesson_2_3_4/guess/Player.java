package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS];
    private int attempts = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public void setNumber(int number) {this.numbers[attempts] = number;}

    public int getNumber() {return numbers[attempts];}

    public void setAttempts() {attempts++;}

    public void resetAttempts() {attempts = 0;}

    public int getAttempts() {return attempts;}

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, attempts, 0);
    }
}
