package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива.");
        int[] intArr = {3, 5, 2, 7, 4, 1, 6};
        int len = intArr.length;
        printIntArr(intArr, "Исходный массив: ");

        for(int i = 0; i <= len / 2; i++) {
            len--;
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        printIntArr(intArr, "\nРеверсивный массив: ");

        System.out.println("\n2. Вывод произведения элементов массива.");
        intArr = new int[10];
        int mult = 1;

        for(int i = 0; i < 10; i++) {
            intArr[i] = i;
            mult *= (i != 0 && i != 9) ? intArr[i] : 1;
            if(i > 0) {
                System.out.print((i < 9 ? intArr[i] : "") + (i < 8 ? " * "  : ""));
            }
        }
        System.out.println(" = " + mult);
        System.out.println("первый элемент массива: " + intArr[0] +
                "\nпоследний элемент массива: " + intArr[intArr.length - 1]);

        System.out.println("\n3. Удаление элементов массива\n");

        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for(int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArr(doubleArr, "Исходный массив: ");
        double middleNum = doubleArr[len / 2];

        int countZero = 0;
        for(int i = 0; i < len; i++) {
            if(doubleArr[i] > middleNum) {
                doubleArr[i] = 0;
                countZero++;
            }
        }
        printDoubleArr(doubleArr, "\nМодифицированный массив: ");
        System.out.println("\nВсего обнулено " + countZero + " ячеек");

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] alphabet = new char[26];
        len = alphabet.length;

        for(int i = 0, j = 65; j <= 90; i++, j++) {
            alphabet[i] = (char) j;
        }

        for(int i = 0; i < len; i++) {
            for(int j = len - 1; j >= len - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        intArr = new int[30];
        len = intArr.length;

        for(int i = 0; i < len; i++) {
            intArr[i] = getUniqueNum(intArr);
        }

        for(int i = len - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < len; i++) {
            System.out.print(intArr[i] +  " ");
            if((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива\n");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcArr.length;

        //Определяем количество пустых элементов
        int countEmptyStr = 0;
        for(int i = 0; i < len; i++) {
            if(srcArr[i].isBlank()) countEmptyStr++;
        }

        String[] destArr = new String[len - countEmptyStr];
        int destPos = 0;
        int countEl = 0;
        for(int i = 0; i < srcArr.length; i++) {
           if(!srcArr[i].isBlank()) {
               countEl++;
           } else {
               if(countEl > 0) {
                   System.arraycopy(srcArr, i - countEl, destArr, destPos, countEl);
                   destPos += countEl;
               }
               countEl = 0;
           }
        }

        printStringArr(srcArr, "Исходный массив: ");
        printStringArr(destArr, "Модифицированный массив: ");
    }

    private static void printIntArr(int[] arr, String msg) {
        System.out.println(msg);
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printDoubleArr(double[] arr, String msg) {
        System.out.println(msg);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%7.5s", arr[i] == 0 ? "0.000" : arr[i]);
            if(i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static int getUniqueNum(int[] arr) {
        int newNum = (int) (60 + Math.random() * 40);
        for (int num : arr) {
            if (num == newNum) {
                return getUniqueNum(arr);
            }
        }
        return newNum;
    }

    private static void printStringArr(String[] arr, String msg) {
        System.out.print(msg);
        for(String str : arr) {
            System.out.print("\"" + str + "\"; ");
        }
        System.out.println();
    }
}