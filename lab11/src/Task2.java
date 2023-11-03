import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        String inputDateStr = "";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату (гггг-мм-дд): ");
            inputDateStr = scanner.next();
        }

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
