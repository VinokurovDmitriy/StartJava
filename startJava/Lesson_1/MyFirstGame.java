import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class MyFirstApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNum = rnd.nextInt(99) + 1;
        int inputNum = 0;
        int count = 0;
        boolean gameOver = false;
        do {
            boolean numIsCorrect = false;
            while(numIsCorrect == false) {
                try {
                    System.out.print("Введите целое число: ");
                    String num = scanner.nextLine();
                    inputNum = Integer.parseInt(num);
                    numIsCorrect = true;
                    } catch (Exception e) {
                        System.out.println("Введите корректно число\n");
                    }
            }
            count++;
            if(inputNum > hiddenNum) {
                System.out.println("\nЧисло " + inputNum + " больше того, что загадал компьютер\n");
            } else if(inputNum < hiddenNum) {
                System.out.println("\nЧисло " + inputNum + " меньше того, что загадал компьютер\n");
            } else {
                gameOver = true;
                System.out.println("\nВы угадали за " + count + " попыток. Загаданное число " + hiddenNum);
            }
        } while(gameOver == false);
    }
}