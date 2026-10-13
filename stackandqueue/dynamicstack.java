package stackandqueue;

public class dynamicstack extends stackcustom{
    public dynamicstack(){
        super();
    }

    public dynamicstack(int size){
        super(size);
    }

    @Override 
    public boolean push(int item){
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }

            data=temp;
        }

        data[++ptr]=item;
        return true;
    }

    public static void main(String[] args) throws Exception{
        dynamicstack stack=new dynamicstack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Capacity: " + stack.data.length);
        stack.push(40);

        System.out.println("Capacity: " + stack.data.length);

        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);

        System.out.println("Capacity: " + stack.data.length);

        System.out.println("Stack size: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
    }
}
