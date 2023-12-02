package task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[10];
    private static int head;
    private static int tail;

    // предусловие: элемент не должен быть null
    // постусловие: элемент добавлен в конец очереди
    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // предусловие: очередь не должна быть пустой
    // постусловие: возвращен первый элемент в очереди
    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // предусловие: очередь не должна быть пустой
    // постусловие: первый элемент удален и возвращен
    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object dequeued = elements[head];
        elements[head] = null; // помогает сборщику мусора
        head = (head + 1) % elements.length;
        size--;
        return dequeued;
    }

    // постусловие: возвращен текущий размер очереди
    public static int size() {
        return size;
    }

    // постусловие: возвращен результат проверки на пустоту очереди
    public static boolean isEmpty() {
        return size == 0;
    }

    // постусловие: все элементы удалены из очереди
    public static void clear() {
        Arrays.fill(elements, null);
        size = 0;
        head = 0;
        tail = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
            if (head > tail) {
                System.arraycopy(elements, 0, elements, elements.length / 2, tail);
                tail += elements.length / 2;
            }
        }
    }
}