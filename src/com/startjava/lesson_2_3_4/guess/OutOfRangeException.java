package com.startjava.lesson_2_3_4.guess;

public class OutOfRangeException extends RuntimeException {
    OutOfRangeException() {
        super("Число должно быть от " + (Player.START_RANGE) + " до " + Player.END_RANGE + ": ");
    }
}
