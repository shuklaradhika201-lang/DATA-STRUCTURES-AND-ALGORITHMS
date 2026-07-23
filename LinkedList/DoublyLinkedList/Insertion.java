package LinkedList.DoublyLinkedList;    
public class Insertion {
    node head;
    node tail;
    node next;
    node previous;

    public void insert(int value) {
        node node1 = new node(value);
        if (head == null) {
            head = node1;
            tail = node1;
            return;
        }
        head.previous = node1;
        node1.next = head;
        node1.previous = null;
        head = node1;
    }

    public void insertatend(int value) {
        node node1 = new node(value);
        if (tail == null) {
            insert(value);
            return;
        }
        tail.next = node1;
        node1.previous = tail;
        node1.next = null;
        tail = node1;
    }

    public void insertatanypos(int value, int position) {
        node node1 = new node(value);
        if (position == 0) {
            insert(value);
            return;
        }
        node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        node1.next = temp.next;
        node1.previous = temp;
        if (temp.next != null) {
            temp.next.previous = node1;
        } else {
            tail = node1; 
        }
        temp.next = node1;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    class node {
        int value;
        node next;
        node previous;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next, node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public static void main(String[] args) {
        Insertion ll = new Insertion();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insertatend(88);
        ll.insertatanypos(33, 2);
        ll.display();
    }
}
