package task2;

public class Main {
    public static void main(String[] args) {
        // Пример использования LinkedQueue
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);

        System.out.println("Front element: " + linkedQueue.peek());
        System.out.println("Dequeued element: " + linkedQueue.dequeue());
        System.out.println("Size: " + linkedQueue.size());
    }
}