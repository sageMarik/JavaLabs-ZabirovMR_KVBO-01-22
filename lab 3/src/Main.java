import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90) + 10;
        }


        System.out.print("Массив: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим результат на экран
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
