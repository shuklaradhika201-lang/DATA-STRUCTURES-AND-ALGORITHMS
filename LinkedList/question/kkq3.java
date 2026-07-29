package LinkedList.question;

public class kkq3 {
    // merge two sorted linked lists
    node head;
    node tail;
    int size;

    public kkq3() {
        this.size = 0;
    }

    public void insert(int value) {
        node node1 = new node(value);

        if (head == null) {
            head = node1;
            tail = node1;
        } else {
            tail.next = node1;
            tail = node1;
        }

        size++;
    }

    public static kkq3 merge(kkq3 first, kkq3 second) {

        node f = first.head;
        node s = second.head;

        kkq3 ans = new kkq3();

        while (f != null && s != null) {

            if (f.value < s.value) {
                ans.insert(f.value);
                f = f.next;
            } else {
                ans.insert(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insert(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insert(s.value);
            s = s.next;
        }

        return ans;
    }

    public void display() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("end");
    }

    static class node {
        int value;
        node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        kkq3 ll = new kkq3();
        kkq3 ll1 = new kkq3();

        ll.insert(1);
        ll.insert(3);
        ll.insert(5);
        ll.insert(7);

        ll.display();

        ll1.insert(2);
        ll1.insert(4);
        ll1.insert(6);

        ll1.display();

        kkq3 merged = merge(ll, ll1);

        System.out.println("Merged Linked List:");
        merged.display();
    }
}