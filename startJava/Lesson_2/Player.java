import java.util.InputMismatchException;
import java.util.Scanner; 

public class Player {

    String name;
    int number;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        while(!correct) {
            try {
                this.number = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно число\n");
                scanner.nextLine();
            }
        }
    }
}