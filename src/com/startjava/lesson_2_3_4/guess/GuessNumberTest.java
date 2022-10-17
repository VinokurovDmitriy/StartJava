package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Player player1 = new Player(inputName("первого", console));
        Player player2 = new Player(inputName("второго", console));
        GuessNumber game = new GuessNumber(player1, player2);
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

    private static String inputName(String order, Scanner console) {
        System.out.print("Введите имя " + order + " игрока: ");
        return console.nextLine();
    }
}
