package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

class GuessNumber {

    private static Player[] players;
    private int hiddenNum;
    private int playerIndex = 0;

    GuessNumber(Player... args) {players = args;}

    public static Player[] getPlayers(){
        return Arrays.copyOf(players, players.length);
    }

    public static void setPlayers(Player[] players) {
        GuessNumber.players = players;
    }

    public void startRound(int round) {
        System.out.println("Раунд " + round);
        hiddenNum = (new Random()).nextInt(Player.MAX_NUM) + 1;
        Player currentPlayer = players[playerIndex];
        boolean freeAttempts;
        boolean guessed;
        do {
            guessed = isGuessed(currentPlayer);
            freeAttempts = checkFreeAttempts();
            if(guessed) {
                currentPlayer.setWins(currentPlayer.getWins() + 1);
            } else {
                currentPlayer = changePlayer(currentPlayer);
            }
        } while(!guessed && freeAttempts);
        printResult(guessed, currentPlayer);
        printAttempts();
        if(round == GuessNumberTest.MAX_ROUND) {
            printWinners();
            GuessNumberTest.setRound();
            for(Player player : players) {
                player.setWins(0);
            }
        }
        resetPlayersData();
    }

    private boolean isGuessed(Player player) {
        String playerName = player.getName();
        System.out.print("Попытка номер " + (player.getAttempts() + 1) + " " + playerName + " введите число: ");
        inputNumber(player);
        boolean guessed = checkNum(player.getNum());
        if (!guessed && player.getAttempts() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + playerName + " закончились попытки");
        }
        return guessed;
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        int num;
        while(!correct) {
            try {
                num = scanner.nextInt();
                player.addNum(num);
                correct = true;
            } catch (InputMismatchException e) {
                System.out.print("Введите корректно число: ");
                scanner.nextLine();
            } catch (OutOfRangeException e) {
            System.out.print(e.getMessage());
            }
        }
    }

    private boolean checkNum(int playerNum) {
        if(playerNum == hiddenNum) {
            System.out.println("Число " + playerNum + " равно числу, которое загадал компьютер\n");
            return true;
        }
        String compare = playerNum > hiddenNum ? "больше" : "меньше";
        System.out.println("Число " + playerNum + " " + compare + " числа, которое загадал компьютер\n");
        return false;
    }

    private boolean checkFreeAttempts() {
        for(Player player : players) {
            if (player.getAttempts() != Player.MAX_ATTEMPTS) {
                return true;
            }
        }
        return false;
    }

    private Player changePlayer(Player player) {
        playerIndex = player == players[players.length - 1] ? 0 : playerIndex + 1;
        return players[playerIndex];
    }

    private void printResult(boolean guessed, Player player) {
        if (guessed) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + hiddenNum + " с " +
                    player.getAttempts() + " попытки");
        } else {
            System.out.println("Никто из игроков не угадал число " + hiddenNum + " загаданное компьютером");
        }
    }

    private void printAttempts() {
        for(Player player : players) {
            System.out.print(player.getName() + " вводил числа ");
            for(int num : player.getNums()) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }

    private void resetPlayersData() {
        for(Player player : players) {
            player.resetData();
        }
    }

    private void printWinners() {
        int maxWins = players[0].getWins();

        for(Player player : players) {
            int playerWins = player.getWins();
            if(player.getWins() > maxWins) {
                maxWins = playerWins;
            }
        }

        for(Player player : players) {
            if(player.getWins() == maxWins) {
                if(maxWins > 0) {
                    System.out.println("Игрок " + player.getName() + " победил. Он угадал число " + maxWins + " раз");
                } else {
                    System.out.println("Никто из игроков не отгадал число");
                }
            }
        }
    }
}
