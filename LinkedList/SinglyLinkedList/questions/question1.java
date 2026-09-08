package LinkedList.SinglyLinkedList.questions;

class creation{
    node head;
    node tail;
    int size;

    public creation() {
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
}

class node{
    int value;
    node next;
    public node(int value){
        this.value=value;
    }
    public node(int value , node next){
        this.value=value;
        this.next=null;
    }
}

public class question1 {
    public static void main(String[] args) {
        creation newnode=new creation();
        newnode.insert(10);
        newnode.insert(20);
        newnode.insert(30);
        newnode.insert(40);
        newnode.insert(50);
        newnode.display();
    }
}
