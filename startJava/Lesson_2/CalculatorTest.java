import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean enought = false;

        while(!enought) {
            float num1 = calculator.getNum("первое");
            char operation = calculator.getOperation();
            float num2 = calculator.getNum("второе");
            float result = calculator.getResult(num1, num2, operation);
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            boolean isReplyCorrect = false;
            while(!isReplyCorrect) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String reply = scanner.nextLine();
                if(reply.equals("yes")) {
                    isReplyCorrect = true;
                } else if(reply.equals("no")) {
                    isReplyCorrect = true;
                    enought = true;
                }
            }
        }
    }
}