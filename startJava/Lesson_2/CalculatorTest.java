import java.util.Scanner;
import java.util.*;

public class CalculatorTest {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean enought = false;
        String reply = "yes";
        while(!reply.equals("no")) {
            if(reply.equals("yes")){
                float num1 = inputNum("первое");
                char operation = inputOperation();
                float num2 = inputNum("второе");
                float result = calculator.calculate(num1, num2, operation);
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            reply = scanner.nextLine();
        }
    }

    private static float inputNum(String index) {
        Scanner scanner = new Scanner(System.in);
        boolean numIsCorrect = false;
        float num = 0f;
        while (!numIsCorrect) {
            System.out.print("Введите " + index + " число: ");
            try {
                num = scanner.nextFloat();
                numIsCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно " + index + " число");
                scanner.nextLine();
            }
        } 
        return num;
    }

    private static char inputOperation() {
        char operation = ' ';
        System.out.print("Введите знак (+, -, *, /, ^ или %): ");
            try {
                operation = (char) System.in.read();
            } catch(java.io.IOException e) {
                System.out.println("Введите символ из списка");
            }
        return operation;
    }
}
