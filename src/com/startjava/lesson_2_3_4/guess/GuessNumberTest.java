package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

class GuessNumberTest {

    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer("первого");
        Player player2 = createPlayer("второго");
        Player player3 = createPlayer("третьего");
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String reply = "yes";
        while(!reply.equals("no")){
            if(reply.equals("yes")) {
                game.start();
            } else {
                 System.out.println("\nВведите ответ корректно");
            }
            System.out.println("\nХотите начать новую игру yes/no?");
            reply = console.nextLine();
        }
    }

    private static Player createPlayer(String order) {
        System.out.print("Введите имя " + order + " игрока: ");
        return new Player(console.nextLine());
    }
}
