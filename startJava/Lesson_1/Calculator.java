import java.util.Scanner;
import java.io.IOException;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        String operationSymbol = "";
        int secondNum = 0;
        boolean num1IsCorrect = false;
        while(num1IsCorrect == false) {
            try {
            System.out.print("Введите первое целое число: ");
            String num1 = scanner.nextLine();
            firstNum = Integer.parseInt(num1);
            num1IsCorrect = true;
            } catch (Exception e) {
                System.out.println("Введите корректно первое число");
            }
        }

        boolean num2IsCorrect = false;
        while(num2IsCorrect == false) {
            try {
                System.out.print("Введите второе целое число: ");
                String num2 = scanner.nextLine();
                secondNum = Integer.parseInt(num2);
                num2IsCorrect = true;
            } catch (Exception e) {
                System.out.println("Введите корректно второе число");
            }
        }

        float test = 0f;
        boolean operationSymbolIsCorrect;
        do {
            operationSymbolIsCorrect = true;
            System.out.print("Введите знак (+, -, *, /, ^ или %): ");
            operationSymbol = scanner.nextLine();
            switch(operationSymbol) {
            case "+": 
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case "*":
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case "/":
                if(secondNum != 0) {
                    System.out.println(firstNum + " / " + secondNum + " = " + (((float) firstNum) / secondNum));
                } else {
                   System.out.println("Вы ввели второе число 0 и выбрали знак /. Делить на 0 нельзя");
                }
                break;
            case "^":
                int result = firstNum;
                for(int i = 2; i <= secondNum; i++) {
                    result *= firstNum;
                }
                System.out.println(firstNum + " ^ " + secondNum + " = " + result);
                break;
            case "%":
                System.out.println(firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
                break;
            default:
                System.out.println("Введите знак корректно");
                operationSymbolIsCorrect = false;
            }
        } while(operationSymbolIsCorrect == false);
    }
}