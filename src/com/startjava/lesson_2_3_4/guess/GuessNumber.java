package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

class GuessNumber {

//    private Player player1;
//    private Player player2;
    private final Player[] players;
    private int hiddenNum;

    GuessNumber(Player... args) {
        players = args;
    }

    public void start() {
        hiddenNum = guessNumber();
        Player currentPlayer = players[0];
        boolean freeAttempts;
        boolean guessed;
        do {
            guessed = isGuessed(currentPlayer);
            freeAttempts = checkFreeAttempts();
            if(!guessed) {
                currentPlayer = changePlayer(currentPlayer);
            }
        } while(!guessed && freeAttempts);
        printWinner(guessed, currentPlayer);
        printAttempts();
        resetPlayers();
    }

    private int guessNumber() {
        System.out.println("Да начнётся новая игра!\n");
        Random rnd = new Random();
        return rnd.nextInt(100) + 1;
    }

    private boolean isGuessed(Player player) {
        String playerName = player.getName();
        System.out.print("Попытка номер " + (player.getAttempts() + 1) + " " + playerName + " введите число: ");
        player.addNum(inputNumber());
        if (player.getAttempts() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + playerName + " закончились попытки");
        }
        return checkNum(player.getNum());
    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        int num = 0;
        while(!correct) {
            try {
                num = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно число\n");
                scanner.nextLine();
            }
        }
        return num;
    }

    private boolean checkNum(int playerNum) {
        String compare;
        boolean guessed = false;
        if(playerNum == hiddenNum) {
            compare = " равно числу";
            guessed = true;
        } else if(playerNum > hiddenNum) {
            compare = " больше числа";
        } else {
            compare = " меньше числа";
        }
        System.out.println("Число " + playerNum + compare + ", что загадал компьютер\n");
        return guessed;
    }

    private Player changePlayer(Player player) {
        return player == players[0] ? players[1] : players[0];
    }

    private boolean checkFreeAttempts() {
        boolean freAttempts = false;
        for(Player player : players) {
            if (player.getAttempts() != Player.MAX_ATTEMPTS) {
                freAttempts = true;
                break;
            }
        }
        return freAttempts;
    }

    private void printWinner(boolean guessed, Player player) {
        if (guessed) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + hiddenNum + " с " +
                    player.getAttempts() + " попытки");
        } else {
            System.out.println("Никто из игроков не угадал число " + hiddenNum + " загаданное компьютером");
        }
    }

    private void printAttempts() {
        for(Player player : players) {
            printAttemptsPlayer(player);
        }
    }

    private void printAttemptsPlayer(Player player) {
        int[] nums = player.getNums();
        System.out.print(player.getName() + " вводил числа ");
        for(int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    private void resetPlayers() {
        for(Player player : players) {
            player.resetData();
        }
    }
}
