import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int year;
        int month;
        int day;
        int hours;
        int minutes;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            year = scanner.nextInt();
            System.out.print("Введите месяц (1-12): ");
            month = scanner.nextInt();
            System.out.print("Введите число (1-31): ");
            day = scanner.nextInt();
            System.out.print("Введите часы (0-23): ");
            hours = scanner.nextInt();
            System.out.print("Введите минуты (0-59): ");
            minutes = scanner.nextInt();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        Date date = calendar.getTime();
        System.out.println("Созданная дата и время: " + date);
    }
}
