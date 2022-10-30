package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int MAX_ATTEMPTS = 10;
    static final int MAX_NUM = 100;
    static final int MIN_NUM = 1;
    private final String name;
    private final int[] nums = new int[MAX_ATTEMPTS];
    private int attempts;
    private int wins;

    Player(String name) {this.name = name;}

    public String getName() {return name;}

    public void addNum(int num) {
        if(num > MAX_NUM || num < MIN_NUM) {
            throw new OutOfRangeException();
        }
        nums[attempts] = num;
        attempts++;
    }

    public int getNum() {return nums[attempts - 1];}

    public int getAttempts() {return attempts;}

    public int[] getNums() {return Arrays.copyOf(nums, attempts);}

    public int getWins() {return wins;}

    public void setWins(int wins) {this.wins = wins;}

    public void resetData() {
        attempts = 0;
        Arrays.fill(nums, 0, attempts, 0);
    }
}
