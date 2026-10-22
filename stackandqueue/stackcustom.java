package stackandqueue;

public class stackcustom {
    protected int[] data;  // why data is protected- basically it shouldnt be accessed out of this class and its inherited classes that why we ensure that data array shoul be protected
    private static final int DEFAULT_SIZE = 10;
    //why is it private static final - it is declared private because DEFAULT_SIZE is an internal implementation detail. Users of your stack should create a stack, not modify its default configuration directly. 
    //static means the variable belongs to the class rather than to individual objects.The constant DEFAULT_SIZE doesn't need a separate copy for each object.
    //Because the default size is a common configuration value, not a property that needs to vary between objects.
    //final means that the variable cannot be reassigned after initialization.

    int ptr = -1; // thr ptr starts with -1 which shows that the array is empty for stack

    public stackcustom() {
        this(DEFAULT_SIZE);
    }

    public stackcustom(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int size() {
        return ptr + 1;
    }

    public static void main(String[] args) throws Exception {
        stackcustom stack = new stackcustom(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}

// The user doesn't need to know or access `DEFAULT_SIZE` to create the stack.  but what if user want s to create stack of 11 and initally it start buikding but doesnt know the size and it can create confusion - for this purpose 1.ask for the default size form the customer itself 2. use dynamic stack