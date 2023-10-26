package Dog;

public class Dog {
    private String name;
    private int age;

    public Dog(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int ageHuman() {
        return (age * 7);
    }
}
