package task1;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[10];
    private int head;
    private int tail;

    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object dequeued = elements[head];
        elements[head] = null; // помогает сборщику мусора
        head = (head + 1) % elements.length;
        size--;
        return dequeued;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        head = 0;
        tail = 0;
    }

    private void ensureCapacity(int capacity) {
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
