import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerName = "Забиров"; // Замените на вашу фамилию
        Date taskReceivedDate = new Date();
        Date taskCompletionDate = new Date();

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + taskReceivedDate);
        System.out.println("Дата и время сдачи задания: " + taskCompletionDate);
    }
}
