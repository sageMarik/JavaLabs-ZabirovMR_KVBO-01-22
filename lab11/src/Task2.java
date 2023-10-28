import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (гггг-мм-дд): ");
        String inputDateStr = scanner.next();
        scanner.close();

        Date inputDate = java.sql.Date.valueOf(inputDateStr);

        if (currentDate.compareTo(inputDate) < 0) {
            System.out.println("Введенная дата находится в будущем.");
        } else if (currentDate.compareTo(inputDate) > 0) {
            System.out.println("Введенная дата находится в прошлом.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
