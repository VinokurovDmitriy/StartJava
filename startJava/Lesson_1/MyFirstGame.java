import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class MyFirstGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNum = rnd.nextInt(100) + 1;
        int inputNum = 0;
        int countAttempts = 0;
        do {
            boolean numIsCorrect = false;
            while(!numIsCorrect) {
                System.out.print("Введите целое число: ");
                try {
                    inputNum = scanner.nextInt();
                    numIsCorrect = true;
                } catch (InputMismatchException e) {
                    System.out.println("Введите корректно число\n");
                    scanner.nextLine();
                }
            }
            countAttempts++;
            if(inputNum > hiddenNum) {
                System.out.println("\nЧисло " + inputNum + " больше того, что загадал компьютер\n");
            } else if(inputNum < hiddenNum) {
                System.out.println("\nЧисло " + inputNum + " меньше того, что загадал компьютер\n");
            }
        } while(inputNum != hiddenNum);
        System.out.println("\nВы угадали за " + countAttempts + " попыток. Загаданное число " + hiddenNum);
    }
}