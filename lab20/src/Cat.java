import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private String name = "meo";

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}