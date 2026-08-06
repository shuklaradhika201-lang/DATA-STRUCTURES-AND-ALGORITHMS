package tree;

import java.util.Scanner;

public class binarytree {
    public binarytree() {

    }

    private static class node {
        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

    private node root;

    public void insert(Scanner scanner) {

        System.out.print("enter the root value :");
        int value = scanner.nextInt();
        root = new node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, node node) {
        System.out.print("do you want to enter left of:  " + node.value + " ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("enter the value of the left of: " + node.value + " ");
            int value = scanner.nextInt();
            node.left = new node(value);
            populate(scanner, node.left);
        }

        System.out.print("do you want to enter right of: " + node.value + " ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("enter the value of the right of: " + node.value + " ");
            int value = scanner.nextInt();
            node.right = new node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(node node, String indent) {

        if (node == null) {
            return;
        }

        display(node.right, indent + "\t");
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
    }

    public void prettydisplay() {
        prettydisplay(root, 0);
    }

    private void prettydisplay(node node, int level) {

        if (node == null) {
            return;
        }
        prettydisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettydisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.insert(scanner);
        tree.prettydisplay();
    }
}