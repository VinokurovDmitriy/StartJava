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
            System.out.println("Одежду твоего размера не найти в магазтнах для лиллипутов");
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

    }
}