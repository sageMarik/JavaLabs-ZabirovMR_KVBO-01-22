package Employee;

import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] employees) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // Форматирование зарплаты с двумя знаками после запятой

        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %10s %n", "Имя сотрудника", "Зарплата");
        System.out.println("------------------------------");

        for (Employee employee : employees) {
            System.out.printf("%-20s %10s %n", employee.getFullname(), decimalFormat.format(employee.getSalary()));
        }
    }

    public static void main(String[] args) {
        // Создаем несколько объектов Employee
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Марат Забиров", 45000.504);
        employees[1] = new Employee("Никита Астафьев", 55000.75232323);
        employees[2] = new Employee("Федор Митин", 60000.25);

        // Генерируем отчет о сотрудниках
        generateReport(employees);
    }
}