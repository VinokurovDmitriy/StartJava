package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

class GuessNumber {

    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int hiddenNum = newGuess();
        Player currentPlayer = null;
        boolean notGuessed;
        int maxAttempts = Player.MAX_ATTEMPTS;
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            newAttempt(currentPlayer, hiddenNum);
            notGuessed = player1.getAttempts() == maxAttempts && player2.getAttempts() == maxAttempts;
        } while(currentPlayer.getNumber() != hiddenNum && !notGuessed);
        printWinner(notGuessed, currentPlayer, hiddenNum);
        printAttempts(player1);
        printAttempts(player2);
        playersReset(player1, player2);
    }

    private int newGuess() {
        System.out.println("Да начнётся новая игра!\n");
        Random rnd = new Random();
        return rnd.nextInt(100) + 1;
    }

    private void newAttempt(Player player, int hiddenNum) {
        String playerName = player.getName();
        int playerAttempts = player.getAttempts();
        System.out.print("Попытка номер " + (playerAttempts + 1) + " " + playerName + " введите число: ");
        player.addNumber(inputNumber());
        checkNum(player.getNumber(), hiddenNum);
        if (playerAttempts == Player.MAX_ATTEMPTS) {
            System.out.println("У " + playerName + " закончились попытки");
        }
    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        int number = 0;
        while(!correct) {
            try {
                number = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно число\n");
                scanner.nextLine();
            }
        }
        return number;
    }

    private void checkNum(int playerNum, int hiddenNum) {
        String compare = playerNum > hiddenNum ? " больше " : " меньше ";
        System.out.println("Число " + playerNum + compare + "того, что загадал компьютер\n");
    }

    private void printWinner(boolean notGuessed, Player currentPlayer, int hiddenNum) {
        if (notGuessed) {
            System.out.println("Никто из игроков не угадал число " + hiddenNum + " загаданное компьютером");
        } else {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + hiddenNum + " с " +
                    currentPlayer.getAttempts() + " попытки");
        }
    }

    private void printAttempts(Player player) {
        int[] attempts = player.getNumbers();
        System.out.print(player.getName() + " вводил числа ");
        for(int num : attempts) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    private static void playersReset(Player player1, Player player2) {
        player1.resetData();
        player2.resetData();
    }
}
