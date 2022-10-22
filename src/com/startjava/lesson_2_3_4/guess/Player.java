package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] nums = new int[MAX_ATTEMPTS];
    private int attempts;

    Player(String name) {this.name = name;}

    public String getName() {return name;}

    public void addNum(int num) {
        nums[attempts] = num;
        attempts++;
    }

    public int getNum() {return nums[attempts - 1];}

    public int getAttempts() {return attempts;}

    public int[] getNums() {return Arrays.copyOf(nums, attempts);}

    public void resetData() {
        attempts = 0;
        Arrays.fill(nums, 0, attempts, 0);
    }
}
