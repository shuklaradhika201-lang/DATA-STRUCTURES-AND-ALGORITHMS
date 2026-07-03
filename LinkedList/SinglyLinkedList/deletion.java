package LinkedList.SinglyLinkedList;

public class deletion {
    node head;
    node tail;
    int size;

    public deletion() {
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

    public void deleteatbeg() {
        if (head == null) { // checking for empty list
            return;
        }
        head = head.next;
        size--;
        if (head == null) {// if list has only one element
            tail = null;
        }
    }

    public void deleteatend() {
        if (head == null) { // check for empty list
            return;
        }
        if (head == tail) { // check for single element list
            head = null;
            tail = null;
            size--;
            return;
        }
        node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteatanypos(int position) {
        if (head == null) {
            return;
        }
        if(position==0){
            deleteatbeg();
            return;
        }
        if(position==size-1){
            deleteatend();
            return;
        }
        node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class node {
        int value;
        node next;

        node(int value) {
            this.value = value;
        }

        node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        deletion ll = new deletion();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        // ll.deleteatbeg();
        // ll.deleteatend();
        ll.deleteatanypos(2);
        ll.display();
    }
}
