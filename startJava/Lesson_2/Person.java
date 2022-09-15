public class Person {

    String sex = "male";
    String name = "Robert";
    int height = 176;
    float weigth = 86.5f;
    int age = 31;

    void say(String text) {
        System.out.println(text);
    }

    boolean learnJava(int day) {
        if(day < 6) {
            return false;
        }
        return true;
    }

    void run() {
        System.out.println("run 5 meters");
    }

    void sitDown() {
        System.out.println("Sit");
    }

    void go(int steps) {
        System.out.println("go " + steps + " steps");
    }
}