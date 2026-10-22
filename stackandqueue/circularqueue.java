package stackandqueue;

public class circularqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public circularqueue() {
        this(DEFAULT_SIZE);
    }

    public circularqueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;  // this is post increment here first we update the value and then will increment the end
        end = end % data.length; // here this is the concept of the circular queue if end is a index which doesnt exist then end will come to the starting index
        //suppose here the index is at 4 after increment it becomes 5 and 5 doesnt exist so it will come back to zero
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length; //move front to the next index 
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }

        return data[front];
    }

    public void display() {
        int i = front;

        for (int count = 0; count < size; count++) {
            System.out.print(data[i] + " <-");
            i = (i + 1) % data.length;
        }

        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        circularqueue queue = new circularqueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
