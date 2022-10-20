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
        Random rnd = new Random();
        int hiddenNum = rnd.nextInt(100) + 1;
        System.out.println("Да начнётся новая игра!\n");
        int playerNum = 0;
        String playerName = "";
        Player currentPlayer = null;
        boolean finished = false;
        int maxAttempts = Player.MAX_ATTEMPTS;
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            playerName = currentPlayer.getName();
            System.out.print("Попытка номер " + (currentPlayer.getAttempts() + 1) + " " + playerName + " введите число: ");
            currentPlayer.setNumber(inputNumber());
            playerNum = currentPlayer.getNumber();
            String compare = playerNum > hiddenNum ? " больше " : " меньше ";
            System.out.println("Число " + playerNum + compare + "того, что загадал компьютер\n");
            currentPlayer.setAttempts();
            if (currentPlayer.getAttempts() == maxAttempts) {
                System.out.println("У " + playerName + " закончились попытки");
            }
            finished = player1.getAttempts() == maxAttempts && player2.getAttempts() == maxAttempts;
        } while(playerNum != hiddenNum && !finished);
        if (finished) {
            System.out.println("Никто из игроков не угадал число " + hiddenNum + " загаданное компьютером");
        } else {
            System.out.println("\nИгрок " + playerName + " угадал число " + hiddenNum + " с " +
                    currentPlayer.getAttempts() + " попытки");
        }
        printAttempts(player1);
        printAttempts(player2);
        playersReset(player1, player2);
    }

    private void printAttempts(Player player) {
        int[] attempts = player.getNumbers();
        System.out.print(player.getName() + " вводил числа ");
        for(int num : attempts) {
            System.out.print(num + ", ");
        }
        System.out.println();
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
    private static void playersReset(Player player1, Player player2) {
        player1.resetNumbers();
        player2.resetNumbers();
        player1.resetAttempts();
        player2.resetAttempts();
    }
}
