package LinkedList.DoublyLinkedList;

public class deletion {
    int size;
    node head;
    node tail;

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

    public void delete() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    public void deleteatend() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.previous;
        tail.next = null;
    }

    public void deletatanypos(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            delete();
            return;
        }
        node temp = head;
        for (int i = 0; i < position; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        if (temp == tail) {
            deleteatend();
            return;
        }
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
    }

    public void display() {
        node temp = head;
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != null);
        System.out.println("HEAD");
    }

    class node {
        node next;
        node previous;
        int value;

        node(int value) {
            this.value = value;
        }

        node(int value, node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        deletion dl = new deletion();
        dl.insert(1);
        dl.insert(2);
        dl.insert(3);
        dl.insert(4);
        dl.insert(5);
        dl.insert(6);
        // dl.delete(3);
        dl.delete();
        dl.deleteatend();
        dl.deletatanypos(3);
        dl.display();
    }
}
