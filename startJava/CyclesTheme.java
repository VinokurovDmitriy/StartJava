public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int oddNumSum = 0;
        int honestNumSum = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                oddNumSum += i;
            } else {
                honestNumSum += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + oddNumSum +
                ", а нечетных = " + honestNumSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 > num3) {
            if (num2 > max) {
                max = num2;
            }
            if (num3 < min) {
                min = num3;
            }
        } else {
            if (num3 > max) {
                max = num3;
            }
            if (num2 < min) {
                min = num2;
            }
        }

        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num4 = 1234;
        int sum = 0;
        System.out.print("Число в обратном порядке ");
        while(num4 > 0) {
            sum += num4 % 10;
            System.out.print(num4 % 10);
            num4 /= 10;
        }
        System.out.println("\nСумма чисел числа " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int count = 1;
        for(i = 1; i < 24; i += 2) {
            System.out.printf("%4s", i);
            if(count % 5 == 0) {
                System.out.println();
            }
            count++;
        }

        for(i = 0; i <= 5 - count % 5; i++) {
            System.out.printf("%4s", 0);
        }

        System.out.println("\n5. Проверка количества единиц на четность\n");
        int num5 = 3141591;
        int tmpNum = num5;
        int countUnits = 0;
        while(tmpNum > 0) {
            if(tmpNum % 10 == 1) {
                countUnits++;
            }
            tmpNum /= 10;
        }

        System.out.print("Число " + num5 + " содержит " + countUnits);
        if(count % 2 == 1) {
            System.out.print(" не ");
        }
        System.out.println("четное количество единиц");
        System.out.println("\n6. Отображение фигур в консоли\n");
        //Прямоугольник
        for(i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        // //Прямоугольный треугольник
        i = 5;
        while(i > 0) {
            System.out.printf( "%" + i + "." + i + "s%n", "#####");
                i--;
            }
        System.out.println();

        //Равнобедренный треугольник
        i = 0;
        int j = 0;
        do {
            if(i < 3) {
                j++;
            } else {
                j--;
            }
            i++;
            System.out.printf("%" + j + "." + j + "s%n", "$$$");
        } while(i < 5);
        System.out.println();

        System.out.println("\n7. Отображение ANSII символов\n");
        //Символы до цифр
        System.out.println("Dec Char");
        for(i = 33; i < 48; i += 2) {
            System.out.printf("%3s", i);
            System.out.printf("%5s%n", (char) i);
        }
        System.out.println();

        //маленькие английские буквы
        System.out.println("Dec Char");
        for(i = 98; i <=122; i += 2) {
            System.out.printf("%3s", i);
            System.out.printf("%5s%n", (char) i);
        }

        System.out.println("\n8. Проверка является ли число палиндромом\n");
        int numOrigin = 1234321;
        int numCopy = numOrigin;
        int divider = 1000000;
        boolean isPalindrome = true;
        while(numCopy > 0) {
            if(numCopy % 10 != numCopy / divider) {
                isPalindrome= false;
            }
            numCopy = numCopy % divider / 10;
            divider /= 100;
        }
        if(isPalindrome) {
            System.out.println("Число " + numOrigin + " является палиндромом");
        } else {
            System.out.println("Число " + numOrigin + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int num6 = 345264;
        int sumLeftPart = 0;
        int sumRightPart = 0;
        int leftPart = num6 / 1000;
        int rightPart = num6 % 1000;
        while(leftPart > 0) {
            sumLeftPart += leftPart % 10;
            leftPart /= 10;
            sumRightPart += rightPart % 10;
            rightPart /= 10;
        }

        System.out.println("Сумма цифр " + num6 / 1000 + " = " + sumLeftPart);
        System.out.println("Сумма цифр " + num6 % 1000 + " = " + sumRightPart);
        if(sumLeftPart == sumRightPart) {
            System.out.println("Число " + num6 + " является счастливым");
        } else {
            System.out.println("Число " + num6 + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("   ТАБЛИЦА ПИФАГОРА");
        System.out.print(" |");
        for(i = 2; i < 10; i++) {
            System.out.printf("%3s", i);
        }

        System.out.println();
        System.out.println("----------------------------");
        for(i = 2; i < 10; i++) {
            System.out.printf("%2s", i + "|");
            for(j = 2; j < 10; j++) {
                System.out.printf("%3s", i * j);
            }
            System.out.println();
        }
    }
}