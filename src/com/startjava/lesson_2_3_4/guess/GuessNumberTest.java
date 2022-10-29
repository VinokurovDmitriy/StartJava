package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

class GuessNumberTest {

    private static final Scanner console = new Scanner(System.in);
    static final int MAX_ROUND = 3;
    private static int round;
    public static void setRound() {
        round = 0;
    }
    public static void main(String[] args) {
        Player player1 = new Player(inputName("первого"));
        Player player2 = new Player(inputName("второго"));
        Player player3 = new Player(inputName("третьего"));
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String reply = "yes";
        while(!reply.equals("no")){
            if(reply.equals("yes")) {
                drawLots();
                System.out.println("Да начнётся новая игра!\n");
                while(round < MAX_ROUND) {
                    game.startRound(round + 1);
                    round++;
                }
            } else {
                 System.out.println("\nВведите ответ корректно");
            }
            System.out.println("\nХотите начать новую игру yes/no?");
            reply = console.nextLine();
        }
    }

    private static String inputName(String order) {
        System.out.print("Введите имя " + order + " игрока: ");
        return console.nextLine();
    }

    private static void drawLots() {
        System.out.println("Игроки должны бросить жребий для определения очередности ходов.");
        Player[] players = GuessNumber.getPlayers();
        for(int i = players.length - 1; i > 0; i--) {
            Player currentPlayer = players[i];
            String name = currentPlayer.getName();
            System.out.print("Игрок " + name + " бросает жребий. Для того чтобы бросить жребий нажмите клавишу ввода.");
            console.nextLine();
            int lot = (new Random()).nextInt(i + 1);
            if(lot < i) {
                Player tempPlayer = players[lot];
                players[lot] = currentPlayer;
                players[i] = tempPlayer;
            }
            System.out.println("Игрок " + name + " ходит " + (lot + 1));
        }
        GuessNumber.setPlayers(players);
    }
}
