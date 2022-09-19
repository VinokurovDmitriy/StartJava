public class WolfTest {

    public static void main(String[] args) {
        Wolf jack = new Wolf();
        jack.setGender("male");
        jack.setName("Jack");
        jack.setWeight(35.32f);
        jack.setAge(4);
        jack.setColor("gray");
        System.out.println("Wolf name is " + jack.getName());
        System.out.println("Sex wolf " + jack.getGender());
        System.out.println("Wolf " + jack.getAge() + " years old");
        System.out.println("Wolf weight " + jack.getWeight());
        System.out.println("Wolf color " + jack.getColor());
        jack.go();
        jack.run();
        jack.hunt();
        jack.howl();
        jack.sit();
    }
}