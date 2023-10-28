import java.util.Arrays;

public class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = {
                new Student(5),
                new Student(2),
                new Student(8),
                new Student(1),
                new Student(3)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        // Сортировка массива студентов по iDNumber с использованием сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(current) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }

        System.out.println("\nAfter sorting by iDNumber (Insertion Sort):");
        System.out.println(Arrays.toString(students));
    }
}
