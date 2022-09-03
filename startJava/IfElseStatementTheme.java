public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 18;
        if(age > 20) {
            System.out.println("Тебе уже нужно искать работу");
        } else {
            System.out.println("Ты можешь делать все что вздумается и не думать ни о чем");
        }

        boolean maleGender = true;
        if(!maleGender) {
            System.out.println("Тебе пора искать мужа");
        } else {
            System.out.println("Пора бы тебе уже жениться");
        }

        float height = 1.83f;
        if(height < 1.8) {
            System.out.println("Тебе можно покупать одежду в \"Детском мире\"");
        } else {
            System.out.println("Одежду твоего размера не найти в магазинах для лилипутов");
        }

        char firstLetterName = "Вася".charAt(0);
        if(firstLetterName == 'М') {
            System.out.println("Твое имя не Петя");
        } else if(firstLetterName == 'I'){
            System.out.println("Ты иностранный гражданин");
        } else {
            System.out.println("Сдаюсь. Не знаю как тебя зовут");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 5;
        int num2 = 9;
        if(num1 > num2) {
            System.out.println("max = " + num1 + ", min = " + num2);
        } else if(num1 < num2) {
            System.out.println("max = " + num2 + ", min = " + num1);
        } else {
            System.out.println("Оба числа равны " + num1);
        }

        System.out.println("\n3. Работа с числом\n");
        int num3 = -642;
        if(num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            if(num3 > 0) {
                System.out.println("Число " + num3 + " положительное");
            } else {
                System.out.println("Число " + num3 + " отрицательное");
            }

            if(num3 % 2 == 1){
                System.out.println("Число " + num3 + " не четное");
            } else {
                System.out.println("Число " + num3 + " четное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 936;
        int num5 = 235;
        System.out.println("Первое число " + num4 + "\nВторое число " + num5);
        if(num4 / 100 == num5 / 100) {
            System.out.println("В обоих числах одинаковые цифры " + (num4 / 100) + " расположены в сотнях");
        }

        if(num4 % 100 / 10 == num5 % 100 / 10) {
            System.out.println("В обоих числах одинаковые цифры " + (num4 % 100 / 10) + " расположены в десятках");
        }

        if(num4 % 10 == num5 % 10) {
            System.out.println("В обоих числах одинаковые цифры " + (num4 % 10) + " расположены в единицах");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char symbol = '\u0057';
        int symbolDec = (int) symbol;
        System.out.print("Символ " + symbol);
        if(symbolDec >= 97 && symbolDec <= 122) {
            System.out.println(" маленькая буква");
        } else if(symbolDec >= 65 && symbolDec <= 90) {
            System.out.println(" большая буква");
        } else if(symbolDec >= 48 && symbolDec <= 57) {
            System.out.println(" цифра");
        } else {
            System.out.println(" не букваа и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        float deposit = 300000f;
        float percent = 10;
        if(deposit < 100000) {
            percent = 5;
        } else if(deposit >=100000 && deposit <= 300000) {
            percent = 7;
        } 

        float percentSum = deposit / 100 * percent;
        System.out.println("Сумма вклада " + deposit + "\nНачислено процентов " + percentSum + 
                "\nИтого с учетом процентов " + (deposit + percentSum));

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 2;
        if(historyPercent > 91) {
            historyGrade = 5;
        } else if(historyPercent > 73) {
            historyGrade = 4;
        } else if(historyPercent > 60) {
            historyGrade = 3;
        }

        int programmingPercent = 91;
        int programmingGrade = 2;
        if(programmingPercent >91) {
            programmingGrade = 5;
        } else if(programmingPercent > 73) {
            programmingGrade = 4;
        } else if(programmingPercent > 60) {
            programmingGrade = 3;
        }

        System.out.println(historyGrade + " История\n" + programmingGrade + " Программирование");
        System.out.println("Средний балл по предметам " + ((programmingGrade + historyGrade) / 2));
        System.out.println("Средний процент " + ((programmingPercent + historyPercent) / 2));

        System.out.println("\n8. Расчет прибыли\n");
        float monthRentValue = 5000f;
        float monthRevenue = 13000f;
        float costOfGoods = 9000f;
        float annualProfit = (monthRevenue - costOfGoods - monthRentValue) * 12;
        System.out.print("Прибыль за год: ");
        if(annualProfit > 0) {
            System.out.print("+");
        }
        System.out.println(annualProfit);

        System.out.println("\n9.Подсчет количества банкнот\n");
        int moneySum = 567;
        int countHundredBanknotes = moneySum / 100;
        int countDozenBanknotes = 5;
        int countSingleBanknotes = moneySum % 10;
        int checkMoneySum = countHundredBanknotes * 100 + countDozenBanknotes * 10 + countSingleBanknotes;
        int missingAmount = moneySum - checkMoneySum;
        if(moneySum > checkMoneySum) {
            if(missingAmount >= 100){
                countDozenBanknotes = missingAmount / 10;
            } else if(missingAmount >= 10) {
                countSingleBanknotes += missingAmount; 
            }
        }
        System.out.println(countHundredBanknotes + " сотенных банкнот,\n" + countDozenBanknotes +
                " банкнот по 10$\n" + countSingleBanknotes + " банкнот по 1$");
        System.out.println("Требуемая сумма " + (countHundredBanknotes * 100 + countDozenBanknotes * 10
                + countSingleBanknotes));
    }
}