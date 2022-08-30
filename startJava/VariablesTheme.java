public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte core = 6;
        System.out.println("Количество ялер: " + core);
        short cpuFreq = 4000;
        System.out.println("Максимальная частота процессора (МГц): " + cpuFreq);
        int gpuFreq = 1500;
        System.out.println("Максимальная частота графического процессора (МГц): " + gpuFreq);
        long numKeys = 12345678012345678L;
        System.out.println("Клавиши цифр на клавиатуре:" + numKeys);
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
    }
}