import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Player player1 = new Player(inputName("первого", scr));
        Player player2 = new Player(inputName("второго", scr));
        GuessNumber newGame = new GuessNumber(player1, player2);
        String reply = "yes";
        while(!reply.equals("no")){
            if(reply.equals("yes")) {
                newGame.startGame();
            } else {
                 System.out.println("\nВведите ответ корректно");
            }
            System.out.println("\nХотите начать новую игру yes/no?");
            reply = scr.nextLine();
        }
        
    }

    private static String inputName(String order, Scanner scr) {
        System.out.print("Введите имя " + order + " игрока: ");
        return scr.nextLine();
    }
}