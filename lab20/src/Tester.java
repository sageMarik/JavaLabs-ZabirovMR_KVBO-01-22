public class Tester {
    public static void main(String[] args) {
        Task1<String, Animal, Integer> task = new Task1<>("Cat", new Cat(), 15);
        System.out.println(task);
    }
}
