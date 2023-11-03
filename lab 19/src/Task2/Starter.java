package Task2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Забиров Марат", 67, 12, 18));
        s.add(new Student("Астафьев Никита", 57, 12, 18));
        s.add(new Student("Ким Владимир", 93, 12, 19));
        s.add(new Student("Митин Федор", 24, 2, 18));
        s.add(new Student("Иванов Алексей", 66, 12, 18));

        new LabClassUI(s);
    }

}