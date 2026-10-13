package stackandqueue;

public class dynamicqueue extends customqueue {
    public dynamicqueue() {
        super();
    }

    public dynamicqueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // If the queue is full, increase its capacity.
        if (isFull()) {

            int[] temp = new int[data.length * 2];

            // Copy existing elements in FIFO order.
            for (int i = 0; i <= end; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // Insert the new element.
        data[++end] = item;

        return true;
    }

    public static void main(String[] args) throws Exception {

        dynamicqueue queue = new dynamicqueue(3);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        System.out.println("Capacity: " + queue.data.length);

        queue.insert(40);

        System.out.println("Capacity: " + queue.data.length);

        queue.insert(50);

        queue.display();

        System.out.println("Removed: " + queue.remove());

        queue.display();
    }
}
