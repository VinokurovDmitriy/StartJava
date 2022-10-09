package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        int len;
        int tempVar;

        System.out.println("1. Реверс значений массива.");
        int[] intArr = {3, 5, 2, 7, 4, 1, 6};
        len = intArr.length;
        printIntArr(intArr, "Исходный массив: ");

        for(int i = 0; i < len / 2; i++) {
            int rightIndex = len - 1 - i;
            tempVar = intArr[i];
            intArr[i] = intArr[rightIndex];
            intArr[rightIndex] = tempVar;
        }
        printIntArr(intArr, "\nРазвернутый массив: ");

        System.out.println("\n2. Вывод произведения элементов массива.");
        intArr = new int[10];
        int multiple = 1;

        for(int i = 0; i < 10; i++) {
            intArr[i] = i;
            multiple *= (i != 0 && i != 9) ? intArr[i] : 1;
            System.out.print(i > 0 && i < 9 ? intArr[i] : "");
            System.out.print(( i > 0 && i < 8 ? " * "  : ""));
        }
        System.out.println(" = " + multiple);
        System.out.println("первый элемент массива: " + intArr[0] +
                "\nпоследний элемент массива: " + intArr[intArr.length - 1]);

        System.out.println("\n3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        len = doubleArr.length;

        for(int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArr(doubleArr, "Исходный массив: ");
        double middleItem = doubleArr[len / 2];

        int countZero = 0;

        for(int i = 0; i < len; i++) {
            if(doubleArr[i] > middleItem) {
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

        for(int i = 0; i < len; i++){
            for(int j = len - 1; j >= len - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        intArr = new int[30];
        len = intArr.length;

        for(int i = 0; i < len; i++) {
            intArr[i] = getUniqueValue(intArr);
        }

        for(int i = len - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArr[j] > intArr[j + 1]) {
                    tempVar = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tempVar;
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
        int countEmptyEl = 0;
        for(int i = 0; i < len; i++) {
            if(srcArr[i].isBlank()) {
                countEmptyEl++;
            }
        }

        //записываем индексы пустых элементов в массив
        int[] emptyPos = new int[countEmptyEl];
        int emptyPosIndex = 0;
        for(int i = 0; i < len; i++) {
            if(srcArr[i].isBlank()) {
                emptyPos[emptyPosIndex++] = i;
            }
        }

        String[] destArr = new String[len - countEmptyEl];
        int destPos = 0;
        for(int i = 0; i < emptyPos.length - 1; i++) {
            int countEl = emptyPos[i + 1] - emptyPos[i] - 1;
            System.arraycopy(srcArr, emptyPos[i] + 1, destArr, destPos, countEl);
            destPos = i + countEl;
        }

        printStringArr(srcArr, "Исходный массив: ");
        printStringArr(destArr, "Модифицированный массив: ");
    }

    private static void printIntArr(int[] arr, String text) {
        System.out.println(text);
        for(int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void printDoubleArr(double[] arr, String text) {
        System.out.println(text);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%7.5s", arr[i]);
            if(i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static int getUniqueValue(int[] arr) {
        int newValue = (int) (60 + Math.random() * 40);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == newValue) {
                arr[i] = getUniqueValue(arr);
            }
        }
        return newValue;
    }

    private static void printStringArr(String[] arr, String text) {
        System.out.print(text);
        for(String item : arr) {
            System.out.print("\"" + item + "\"; ");
        }
        System.out.println();
    }
}