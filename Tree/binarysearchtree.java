package Tree;

import java.util.Scanner;

class BinarySearchTree {

    public class Node { // node   class

        private int value;
        private int height;  //every node will also remeber the height we will come back to the height because height is important to check whether the tree is balanced 
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }  // as we have declared the value in private so we will use getter  setter method to retireve the value 

        public int getValue() {
            return value;
        } //this supports encapsulation
    }

    private Node root;
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;  //every node stores its height so we are simply saying that give me the height stored inside this node
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int value = sc.nextInt();
        root = insert(value, root);
        while (true) {
            System.out.print("Do you want to enter another node? ");
            boolean choice = sc.nextBoolean();
            if (!choice) {
                break;
            }
            System.out.print("Enter the value: ");
            value = sc.nextInt();
            root = insert(value, root);
        }
    }

    //why we have two insert function because the first has public insert which talks to the user and the second one has private insert which actually handles the logic 

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(
                height(node.left),
                height(node.right)) + 1;

        return node;
    }
    public boolean contains(int value) {
        return contains(value, root);
    }

    //these 2 contains are for to check does this tree contain this value ?

    private boolean contains(int value, Node node) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        if (value < node.value) {
            return contains(value, node.left);
        }

        return contains(value, node.right);
    }

    public void display() {
        display(root, "", false);
    }

    private void display(Node node, String indent, boolean isLeft) {

        if (node == null) {
            return;
        }
        display(node.right, indent + "        ", false);
        System.out.println(
                indent + (isLeft ? "└── " : "┌── ") + node.value);
        display(node.left, indent + "        ", true);
    }

    public boolean balanced() {
        return balanced(root);
    }

    //this is for to check whether the tree is balanced or not

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        return Math.abs(
                height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);  //this is the complete balance situation
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert();
        tree.display();

        System.out.println("Is tree balanced? " + tree.balanced());
    }
}