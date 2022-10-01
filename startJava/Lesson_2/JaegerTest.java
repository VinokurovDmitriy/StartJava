public class JaegerTest {

    public static void main(String[] args) {
        Jaeger acidGeisha = new Jaeger();
        acidGeisha.setModelName("Acid Geisha");
        acidGeisha.setMark("mark - 27");
        acidGeisha.setOrigin("Japan");
        acidGeisha.setWeight(2.1f);
        acidGeisha.setHeight(60.5f);
        acidGeisha.setStrength(8);
        acidGeisha.setArmor(10);
        System.out.println(acidGeisha.getModelName() + " made in " + acidGeisha.getOrigin());
        System.out.println("This Jaeger is " + acidGeisha.getMark() + " and this model is " + 
                acidGeisha.getHeight() + " height\nand " + acidGeisha.getWeight() + " weight and strangth " + 
                acidGeisha.getStrength() + " and have armor " + acidGeisha.getArmor());
        System.out.print(acidGeisha.getModelName() + " ");
        acidGeisha.move();
        acidGeisha.scanKaiju();
        if(acidGeisha.drift()) {
            acidGeisha.attack();
        }

        Jaeger apex = new Jaeger("Apex", "mark - 9", "USA", 3.2f, 70.5f, 9, 7);
        System.out.println("\n" + apex.getModelName() + " characteristics: ");
        System.out.println("Mark - " + apex.getMark());
        System.out.println("Origin: " + apex.getOrigin());
        System.out.println("Weight: " + apex.getWeight());
        System.out.println("Height: " + apex.getHeight());
        System.out.println("Strength: " + apex.getStrength());
        System.out.println("Armor: " + apex.getArmor());
        System.out.println("\nStatistics: ");
        System.out.print("9.00 - ");
        apex.move();
        System.out.print("12.00 - ");
        apex.scanKaiju();
        System.out.print("12.05 - ");
        apex.attack();
        apex.setArmor(apex.getArmor() - 3);
        System.out.println("12.20 - left armor" + apex.getArmor());
    }
}