public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль\n");
        byte countCores = 6;
        System.out.println("Количество ядер: " + countCores);
        short cpuFreq = 4000;
        System.out.println("Максимальная частота процессора (МГц): " + cpuFreq);
        int gpuFreq = 1500;
        System.out.println("Максимальная частота графического процессора (МГц): " + gpuFreq);
        long capacityHdd = 256000L;
        System.out.println("Ёмкость жесткогоо диска (Мб):" + capacityHdd);
        float price = 45000.230f;
        System.out.println("Цена: " + price);
        double screenDiagonal = 15.6;
        System.out.println("Диагональ экрана (дюйм): " + screenDiagonal);
        char rizenVersion = '5';
        System.out.println("Версия процессора AMD Ryzen: " + rizenVersion);
        boolean grey = true;
        System.out.println("Компьютер хороший? " + good);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        float costPen = 100;
        float costBook = 200;
        float discount = 11;
        float discountSum = (costPen + costBook) * discount / 100;
        System.out.println("Размер скидки: " + discountSum);
        float discountPrice = costPen + costBook - discountSum;
        System.out.println("Cтоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод на консоль слова Java\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        System.out.println("byte " + byteNum);
        System.out.println("byte++ " + (byteNum + 1));
        System.out.println("byte -- " + (byteNum - 1));
        short shortNum = 32767;
        System.out.println("short " + shortNum);
        System.out.println("short++ " + (shortNum + 1));
        System.out.println("short-- " + (shortNum - 1));
        int intNum = 2147483647;
        System.out.println("int " + intNum);
        System.out.println("int++ " + (intNum + 1));
        System.out.println("int-- " + (intNum - 1));
        long longNum = 9223372036854775807L;
        System.out.println("longNum " + longNum);
        System.out.println("longMum++ " + (longNum + 1));
        System.out.println("longNum-- " + (longNum - 1));
        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 5;
        int num2 = 2;
        System.out.println("Перестановка с помощью дополнительной переменной");
        System.out.println("\nДо перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("\nПосле перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nПерестановка с помощью арифметических опрераций");
        System.out.println("\nДо перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        tmp = num1 + num2;
        num1 = tmp - num1;
        num2 = tmp - num2;
        System.out.println("\nПосле перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nПерестановка с помощью побитовой операции");
        System.out.println("\nДо перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 = tmp ^ num1;
        num2 = tmp ^ num2;
        System.out.println("\nПосле перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char code1 = 35;
        char code2 = 38;
        char code3 = 64;
        char code4 = 94;
        char code5 = 95;
        System.out.println((int) code1 + " = " + code1);
        System.out.println((int) code2 + " = " + code2);
        System.out.println((int) code3 + " = " + code3);
        System.out.println((int) code4 + " = " + code4);
        System.out.println((int) code5 + " = " + code5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println(num / 100 + " Сотня");
        System.out.println(num / 10 % 10 + " Десятка");
        System.out.println(num % 10 + " Единицы");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char slash = 47;
        char backslash = 92;
        char space = 32;
        char oBracket = 40;
        char cBracket = 41;
        char underscore = 95;
        System.out.println(space + "" + space + "" + space + "" + space + "" + slash + "" + backslash);
        System.out.println(space + "" + space + "" + space + "" + slash + "" + space + "" + space + 
                "" + backslash);
        System.out.println(space + "" + space + "" +slash + "" + underscore + "" + oBracket + "" +
                space + cBracket + "" + backslash);
        System.out.println(space + "" + slash + "" + space + "" + space + "" + space + "" + space + 
                "" + space + "" + space + ""+ backslash);
        System.out.println(slash + "" + "" + underscore + "" + "" + underscore + "" + underscore + 
                "" + "" + underscore + "" + slash + "" + backslash + "" + underscore + "" + 
                underscore + "" + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа\n");
        int num3  = 345;
        int hundreds = num3 / 100;
        int dozens = num3 / 10 % 10;
        int units = num3 % 10;
        System.out.println("Сумма цифр числа " + num3 + " равна " + (hundreds + dozens + units));
        System.out.println("Произведение цифр числа " + num3 + " равна " + (hundreds * dozens * units));

        System.out.println("\n10. Преобразование секунд\n");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minuts = seconds % 3600 / 60;
        int sec = seconds % 60;
        System.out.println(hours + ":" + minuts + ":" + sec);
    }
}