package LinkedList.SinglyLinkedList.questions;

class creat {
    node head;
    node tail;
    int size;

    public creat() {
        this.size = 0;
    }

    public void insert(int value) {
        node node1 = new node(value);
        node1.next = head;
        head = node1;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int length() {
        node temp = head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        return count;
    }

    public int search(int searchvalue){
        node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.value==searchvalue){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public int max(){
        node temp=head;
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.value>max){
                max=temp.value;
            }
            temp=temp.next;
        }
        return max;
    }

    public int min(){
        node temp=head;
        int min=Integer.MAX_VALUE;
        while(temp!=null){
            if(temp.value<min){
                min=temp.value;
            }
            temp=temp.next;
        }
        return min;
    }

    public int searchnth(int position){
        node temp=head;
        int count=0;
        while(temp!=null){
            if(count==position){
                return temp.value;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }
}

class node {
    int value;
    node next;

    public node(int value) {
        this.value = value;
    }

    public node(int value, node next) {
        this.value = value;
        this.next = null;
    }
}

public class question2 {
    public static void main(String[] args) {
        creat newnode = new creat();
        newnode.insert(10);
        newnode.insert(20);
        newnode.insert(30);
        newnode.insert(40);
        newnode.insert(50);
        newnode.display();
        System.out.println(newnode.length());
        System.out.println(newnode.search(30));
        System.out.println(newnode.max());
        System.out.println(newnode.min());
        System.out.println(newnode.searchnth(3));
    }
}
