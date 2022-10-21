package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS];
    private int attempts;

    Player(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public void addNumber(int number) {
        numbers[attempts] = number;
        attempts++;
    }

    public int getNumber() {return numbers[attempts - 1];}

    public int getAttempts() {return attempts;}

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void resetData() {
        attempts = 0;
        Arrays.fill(numbers, 0, attempts, 0);
    }
}
