import java.util.*;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

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

    private char inputOperation() {
        char operation = ' ';
        System.out.print("Введите знак (+, -, *, /, ^ или %): ");
            try {
                operation = (char) System.in.read();
            } catch(java.io.IOException e) {
                System.out.println("Введите символ из списка");
            }
        return operation;
    }

    private float calculate(float num1, float num2, char operation) {
        float result = 0;
        switch(operation) {
            case '+': 
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result =  num1 / num2;
                break;
            case '^':
                result = num1;
                for(int i = 2; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            }
        return result;
    }


    public float getNum(String index) {
        return inputNum(index);
    }

    public char getOperation() {
        return inputOperation();
    }

    public float getResult(float num1, float num2, char operation) {
        return calculate(num1, num2, operation);
    }
}
