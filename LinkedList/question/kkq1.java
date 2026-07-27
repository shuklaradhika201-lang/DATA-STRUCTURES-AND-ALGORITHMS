package LinkedList.question;

public class kkq1 {
    node head;
    node tail;
    int size = 0;

    public void insert(int value, int index) {
        head = insert(value, index, head);
    }

    public node insert(int val, int index, node node) {
        if (index == 0) {
            node temp = new node(val, node);
            size++;
            return temp;
        }
        node.next = insert(val, index - 1, node.next);
        return node;
    }

    class node {
        int value;
        node next;

        node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }
}