package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int END_RANGE = 100;
    static final int START_RANGE = 1;
    private final String name;
    private final int[] nums = new int[GuessNumber.MAX_ATTEMPTS];
    private int attempts;
    private int win;

    Player(String name) {this.name = name;}

    public String getName() {return name;}

    public void addNum(int num) {
        if(num > END_RANGE || num < START_RANGE) {
            throw new OutOfRangeException();
        }
        nums[attempts] = num;
        attempts++;
    }

    public int getNum() {return nums[attempts - 1];}

    public int getAttempts() {return attempts;}

    public int[] getNums() {return Arrays.copyOf(nums, attempts);}

    public int getWins() {return win;}

    public void setWin(int win) {this.win = win;}

    public void resetData() {
        attempts = 0;
        Arrays.fill(nums, 0, attempts, 0);
    }
}
