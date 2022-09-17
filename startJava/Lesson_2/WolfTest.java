public class WolfTest {

    public static void main(String[] args) {
        Wolf jack = new Wolf();
        jack.gender = "male";
        jack.name = "Jack";
        jack.weight = 35.32f;
        jack.age = 4;
        jack.color = "gray";
        System.out.println("Wolf name is " + jack.name);
        System.out.println("Sex wolf " + jack.gender);
        System.out.println("Wolf " + jack.age + " years old");
        System.out.println("Wolf weight " + jack.weight);
        System.out.println("Wolf color " + jack.color);
        jack.go();
        jack.run();
        jack.hunt();
        jack.howl();
        jack.sit();
    }
}