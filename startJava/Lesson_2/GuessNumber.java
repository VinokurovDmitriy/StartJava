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

    public int inputNumber() {
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

    public void start() {
        Random rnd = new Random();
        int hiddenNum = rnd.nextInt(100) + 1;
        System.out.println("Да начнётся новая игра!\n");
        int playerNum = 0;
        Player currentPlayer = player2;
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            String playerName = currentPlayer.getName();
            System.out.print(playerName + " введите число: ");
            currentPlayer.setNumber(inputNumber());
            playerNum = currentPlayer.getNumber();
            if(playerNum > hiddenNum) {
                System.out.println("\nЧисло " + playerNum + " больше того, что загадал компьютер\n");
            } else if(playerNum < hiddenNum) {
                System.out.println("\nЧисло " + playerNum + " меньше того, что загадал компьютер\n");
            } else {
                System.out.println("\nЗагаданное число " + hiddenNum + ". Победил игрок " + playerName);
            }
        } while(playerNum != hiddenNum);
    }
}