package stackandqueue;
import java.util.*;
public class genericimplementation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>();

        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //deque you can insert and delete from both the side 
        Deque<Integer> deque=new ArrayDeque<>();
        //araydeque have no capcity restrictions

        deque.add(89);
        deque.addLast(33);
        deque.remove();
    }
}
