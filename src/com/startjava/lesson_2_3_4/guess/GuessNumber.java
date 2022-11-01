package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

class GuessNumber {

    static final int MAX_ATTEMPTS = 10;
    private final Scanner console = new Scanner(System.in);
    private Player[] players;
    private int round;
    private int hiddenNum;

    GuessNumber(Player... players) {this.players = players;}

    public Player[] getPlayers() {return Arrays.copyOf(players, players.length);}

    public void setPlayers(Player[] players) {this.players = players;}

    public void start() {
        drawLots();
        int maxRound = 3;
        int playerIndex = 0;
        while (round < maxRound) {
            System.out.println("Раунд " + (round + 1));
            hiddenNum = (new Random()).nextInt(Player.END_RANGE) + 1;
            Player currentPlayer = players[playerIndex];
            boolean freeAttempts;
            boolean guessed;
            do {
                guessed = isGuessed(currentPlayer);
                freeAttempts = checkFreeAttempts();
                if(!guessed) {
                    playerIndex = currentPlayer == players[players.length - 1] ? 0 : playerIndex + 1;
                    currentPlayer = players[playerIndex];
                }
            } while (!guessed && freeAttempts);
            printResult(guessed, currentPlayer);
            printAttempts();
            if (round == maxRound) {
                printWinners();
                for (Player player : players) {
                    player.setWin(0);
                }
            }
            resetPlayersData();
            round++;
        }
    }

    public void drawLots() {
        System.out.println("Игроки должны бросить жребий для определения очередности ходов.");
        Player[] players = getPlayers();
        for (int i = players.length - 1; i > 0; i--) {
            Player currentPlayer = players[i];
            String name = currentPlayer.getName();
            System.out.print("Игрок " + name + " бросает жребий. Для того чтобы бросить жребий нажмите клавишу ввода.");
            console.nextLine();
            int lot = (new Random()).nextInt(i + 1);
            if (lot < i) {
                Player tempPlayer = players[lot];
                players[lot] = currentPlayer;
                players[i] = tempPlayer;
            }
            System.out.println("Игрок " + name + " ходит " + (lot + 1));
        }
        setPlayers(players);
    }

    private boolean isGuessed(Player player) {
        String playerName = player.getName();
        System.out.print("Попытка номер " + (player.getAttempts() + 1) + " " + playerName + " введите число: ");
        inputNumber(player);
        boolean guessed = checkNum(player.getNum());
        if (guessed) {
            player.setWin(player.getWins() + 1);
        } else if(player.getAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + playerName + " закончились попытки");
        }
        return guessed;
    }

    private void inputNumber(Player player) {
        boolean correct = false;
        int num;
        while (!correct) {
            try {
                num = console.nextInt();
                player.addNum(num);
                correct = true;
            } catch (InputMismatchException e) {
                System.out.print("Введите корректно число: ");
                console.nextLine();
            } catch (OutOfRangeException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    private boolean checkNum(int playerNum) {
        if (playerNum == hiddenNum) {
            System.out.println("Число " + playerNum + " равно числу, которое загадал компьютер\n");
            return true;
        }
        String compare = playerNum > hiddenNum ? "больше" : "меньше";
        System.out.println("Число " + playerNum + " " + compare + " числа, которое загадал компьютер\n");
        return false;
    }

    private boolean checkFreeAttempts() {
        for (Player player : players) {
            if (player.getAttempts() != MAX_ATTEMPTS) {
                return true;
            }
        }
        return false;
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
        for (Player player : players) {
            System.out.print(player.getName() + " вводил числа ");
            for (int num : player.getNums()) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }

    private void resetPlayersData() {
        for (Player player : players) {
            player.resetData();
        }
    }

    private void printWinners() {
        int maxWins = players[0].getWins();

        for (Player player : players) {
            int playerWins = player.getWins();
            if (player.getWins() > maxWins) {
                maxWins = playerWins;
            }
        }

        for (Player player : players) {
            if (player.getWins() == maxWins) {
                if (maxWins > 0) {
                    System.out.println("Игрок " + player.getName() + " победил. Он угадал число " + maxWins + " раз");
                } else {
                    System.out.println("Никто из игроков не отгадал число");
                }
            }
        }
    }
}
