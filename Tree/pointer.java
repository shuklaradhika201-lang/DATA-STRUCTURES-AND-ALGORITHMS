//lc 116 question

package Tree;

public class pointer {

    public static void main(String[] args) {
        pointer tree = new pointer();
        node root = new node(1);

        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(7);

        tree.connect(root);
        tree.display(root);
    }

    public static class node {
        int val;
        node left;
        node right;
        node next;

        node(int val) {
            this.val = val;
        }
    }

    public void display(node root) {
        node current = root;

        while (current != null) {
            node temp = current;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("null");

            current = current.left;
        }
    }

    public node connect(node root) {
        if ((root) == null) {
            return null;
        }
        node leftmost = root;
        while (leftmost.left != null) {
            node current = leftmost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
}
