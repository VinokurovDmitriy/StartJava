public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private float height;
    private int strength; 
    private int armor;
    
    Jaeger(String modelName, String mark, String origin, float weight, float height, int strength,
            int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight; 
        this.height = height;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(float strengt) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    Jaeger() {
        modelName = "default";
        mark = "unknown";
        origin = "unknown";
        weight = 10f;
        height = 10f;
        strength = 10;
        armor = 10;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.print("Moving\n");
    }

    public void scanKaiju() {
        System.out.print("Scanning\n");
    }

    public void attack() {
        System.out.print(modelName + " attacks\n");
    }

}