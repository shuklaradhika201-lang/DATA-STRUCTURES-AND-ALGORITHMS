package Tree;

import java.util.Scanner;

public class avl {

    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    // Returns the height of a node
    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    // Insert a value into the AVL tree
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {

        // If there is no node, create one
        if (node == null) {
            return new Node(value);
        }

        // Normal BST insertion
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Balance the tree
        return rotate(node);
    }

    // Rotate the tree if it becomes unbalanced
    private Node rotate(Node node) {

        int balance = height(node.left) - height(node.right);

        // Left heavy
        if (balance > 1) {

            // Left-Left case
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node);
            }

            // Left-Right case
            if (height(node.left.left) < height(node.left.right)) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right heavy
        if (balance < -1) {

            // Right-Right case
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node);
            }

            // Right-Left case
            if (height(node.right.right) < height(node.right.left)) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // Right Rotation
    private Node rightRotate(Node p) {

        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // Update heights
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Left Rotation
    private Node leftRotate(Node c) {

        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        // Update heights
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    // Populate the tree
    public void populate(Scanner scanner) {

        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();

        root = new Node(value);

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        System.out.print("Do you want to enter a value to the left of "
                + node.value + "? ");

        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.print("Enter the value: ");
            int value = scanner.nextInt();

            node.left = new Node(value);

            populate(scanner, node.left);
        }

        System.out.print("Do you want to enter a value to the right of "
                + node.value + "? ");

        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.print("Enter the value: ");
            int value = scanner.nextInt();

            node.right = new Node(value);

            populate(scanner, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    // Display the tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {

        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // Check whether the tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        int balance = height(node.left) - height(node.right);

        return Math.abs(balance) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        avl tree = new avl();

        System.out.println("Enter values to insert into AVL tree:");

        while (true) {

            System.out.print("Enter value: ");
            int value = scanner.nextInt();

            tree.insert(value);

            System.out.print("Do you want to insert another value? ");
            boolean choice = scanner.nextBoolean();

            if (!choice) {
                break;
            }
        }

        System.out.println("\nAVL Tree:");
        tree.display();

        System.out.println("\nIs the tree balanced? "
                + tree.balanced());

        scanner.close();
    }
}