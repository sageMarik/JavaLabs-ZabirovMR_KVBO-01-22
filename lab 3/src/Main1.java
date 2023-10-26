import java.util.Scanner;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Повторите попытку: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Создаем массив из n случайных целых чисел из отрезка [0; n]
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1); // Генерируем число от 0 до n
        }

        // Выводим первый массив на экран
        System.out.print("Первый массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Создаем второй массив только из четных элементов первого массива
        int evenCount = 0; // Количество четных элементов
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount > 0) {
            int[] evenArray = new int[evenCount];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    evenArray[index] = array[i];
                    index++;
                }
            }

            // Выводим второй массив на экран
            System.out.print("Второй массив (чётные элементы): ");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("В первом массиве нет чётных элементов.");
        }

        scanner.close();
    }
}