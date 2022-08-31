public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte core = 6;
        System.out.println("Количество ялер: " + core);
        short cpuFreq = 4000;
        System.out.println("Максимальная частота процессора (МГц): " + cpuFreq);
        int gpuFreq = 1500;
        System.out.println("Максимальная частота графического процессора (МГц): " + gpuFreq);
        long bigNum = 12345678012345678L;
        System.out.println("Можно напечатать число:" + bigNum);
        float price = 45000.230f;
        System.out.println("Цена: " + price);
        double pi = 3.141592653;
        System.out.println("Можно вывести на экран число pi: " + pi);
        char letter = 's';
        System.out.println("Можно напечатать букву: " + letter);
        boolean good = true;
        System.out.println("Компьютер хороший? " + good);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int pen = 100;
        int book = 200;
        int discount = 11;
        float discountSum = (float) (pen + book) * discount / 100;
        System.out.println("Размер скидки: " + discountSum);
        float totalCost = (float) (pen + book - discountSum);
        System.out.println("Cтоимость товаров со скидкой: " + totalCost);

        System.out.println("\n3. Вывод на консоль слова Java\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        System.out.println("byte " + byteNum);
        byte byteNumInc = (byte) (byteNum + 1);
        System.out.println("byte++ " + byteNumInc);
        byte byteNumDec = byteNum--;
        System.out.println("byte -- " + byteNumDec);
        short shortNum = 32767;
        System.out.println("short " + shortNum);
        short shortNumInc = (short) (shortNum + 1);
        System.out.println("short++ " + shortNumInc);
        short shortNumDec = (short) (shortNum - 1);
        System.out.println("short-- " + shortNumDec);
        int intNum = 2147483647;
        System.out.println("int " + intNum);
        int intNumInc = intNum + 1;
        System.out.println("int++ " + intNumInc);
        int intNumDec = intNum - 1;
        System.out.println("int-- " + intNumDec);
        long longNum = 9223372036854775807L;
        System.out.println("longNum " + longNum);
        long longNumInc = (long) (longNum + 1);
        System.out.println("longMum++ " + longNumInc);
        long longNunDec = (long)longNum - 1;
        System.out.println("longNum-- " + longNunDec);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 5;
        int num2 = 2;
        System.out.println("\nПерестановка с помощью дополнительной переменной\n");
        System.out.println("До перстановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("\nПосле перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nПерестановка с помощью арифметических опрераций\n");
        System.out.println("До перстановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int sum = num1 + num2;
        num1 -= sum;
        num2 -= sum;
        System.out.println("\nПосле перестановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nПерстановка с помощью побитовой операции\n");
        System.out.println("До перстановки: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 = sum ^ num1;
        num2 = sum ^ num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char cod1 = 35;
        char cod2 = 38;
        char cod3 = 64;
        char cod4 = 94;
        char cod5 = 95;
        System.out.println((int) cod1 + " = " + cod1);
        System.out.println((int) cod2 + " = " + cod2);
        System.out.println((int) cod3 + " = " + cod3);
        System.out.println((int) cod4 + " = " + cod4);
        System.out.println((int) cod5 + " = " + cod5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println(num / 100 + " Сотня");
        System.out.println(num / 10 % 10 + " Десятка");
        System.out.println(num % 10 + " Единицы");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char slash = 47;
        char slash2 = 92;
        char space = 32;
        char bracket = 40;
        char bracket2 = 41;
        char underscore = 95;
        System.out.println("    " + slash + "" + slash2);
        System.out.println("   " + slash + "  " + slash2);
        System.out.println("  " + slash + "" + underscore + "" + bracket + "" + space +
            bracket2 + "" + slash2);
        System.out.println(space + "" + slash + "      " + slash2);
        System.out.println(slash + "" + "" + underscore + "" + "" + underscore + "" + underscore + "" +
            "" + underscore + "" + slash + "" + slash2 + "" + underscore + "" + underscore + "" + slash2);

        System.out.println("\n9. Произведение и сумма цифр числа\n");
        int num3  = 345;
        int hundreds = num3 / 100;
        int dozens = num3 / 10 % 10;
        int units = num3 % 10;
        System.out.println("Суммф цифр числа N равна " + hundreds + dozens + units);
        System.out.println("Произведение цифр числа N равна " + hundreds * dozens * units);

        System.out.println("\n10. Преобразование секунд\n");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minuts = (seconds - hours * 3600) / 60;
        int sec = seconds % 60;
        System.out.println(hours + ":" + minuts + ":" + sec);
    }
}