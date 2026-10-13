package stackandqueue;

public class stackcustom {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public stackcustom(){
        this(DEFAULT_SIZE);
    }

    public stackcustom(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek from an empty stack");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr==data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception{
        stackcustom stack=new stackcustom(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
