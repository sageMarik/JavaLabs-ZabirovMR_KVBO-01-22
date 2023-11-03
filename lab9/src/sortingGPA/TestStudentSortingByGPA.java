package sortingGPA;

import java.util.Arrays;

public class TestStudentSortingByGPA {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, 3.5),
                new Student(2, 3.2),
                new Student(3, 3.9),
                new Student(4, 3.7),
                new Student(5, 3.1)
        };

        System.out.println("Before sorting by GPA:");
        System.out.println(Arrays.toString(students));

        // Сортировка массива студентов по GPA с использованием быстрой сортировки
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (Quick Sort):");
        System.out.println(Arrays.toString(students));
    }
}
