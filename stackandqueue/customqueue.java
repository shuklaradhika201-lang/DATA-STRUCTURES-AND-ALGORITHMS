package stackandqueue;

public class customqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=-1;

    public customqueue(){
        this(DEFAULT_SIZE);
    }

    public customqueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length-1;
    }

    public boolean isEmpty(){
        return end==-1;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[++end]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed=data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<=end;i++){
            System.out.print(data[i] + " ");
        }

        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        customqueue queue=new customqueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(9);
        queue.insert(10);

        queue.display();
    }
}

//inorder to remove element it tasks o(n) time complexity