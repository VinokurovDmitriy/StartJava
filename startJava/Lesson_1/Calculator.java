import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        boolean num1IsCorrect = false;
        while(!num1IsCorrect) {
            try {
                System.out.print("Введите первое целое число: ");
                num1 = scanner.nextInt();
                num1IsCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно первое число");
                scanner.nextLine();
            }
        }

        int num2 = 0;
        boolean num2IsCorrect = false;
        while(!num2IsCorrect) {
            try {
                System.out.print("Введите второе целое число: ");
                num2 = scanner.nextInt();
                num2IsCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректно второе число");
                scanner.nextLine();
            }
        }

        boolean operationIsCorrect;
        float quotient = 0;
        char operation = ' ';
        int result = 0;
        do {
            operationIsCorrect = true;
            System.out.print("Введите знак (+, -, *, /, ^ или %): ");
            try {
                operation = (char) System.in.read();
            } catch(java.io.IOException e) {
                System.out.println("Введите символ из списка");
            }

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
                if(num2 != 0) {
                    quotient = ((float) num1) / num2;
                } else {
                   System.out.println("Вы ввели второе число 0 и выбрали знак /. Делить на 0 нельзя");
                   operationIsCorrect = false;
                }
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
            default:
                System.out.println("Введите знак корректно");
                operationIsCorrect = false;
            }
        } while(!operationIsCorrect);
        
        if(operation == '/' && num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        } else {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
    }
}