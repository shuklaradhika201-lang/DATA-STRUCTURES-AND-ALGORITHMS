package stackandqueue;

public class deque {
    private int[] data;
    private int front;
    private int size;

    public deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        data = new int[capacity];
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    // Insert at the front
    public boolean insertFront(int item) {
        if (isFull()) {
            return false;
        }

        front = (front - 1 + data.length) % data.length;
        data[front] = item;
        size++;

        return true;
    }

    // Insert at the rear
    public boolean insertRear(int item) {
        if (isFull()) {
            return false;
        }

        int rear = (front + size) % data.length;
        data[rear] = item;
        size++;

        return true;
    }

    // Remove from the front
    public int deleteFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        return removed;
    }

    // Remove from the rear
    public int deleteRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int rear = (front + size - 1) % data.length;
        int removed = data[rear];
        size--;

        return removed;
    }
}