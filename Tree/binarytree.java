package Tree;

import java.util.Scanner;

class binarytree {  //this is main class it can also be written as public class binarytree both are same 

    private static class node { //here we have a class inside class which is called nested class 

        //why we need a nested class because bt are made up of nodes and each node stores 3 value root left child and right child 

        //it is declared as private because it should only be acessible in binarytree

        //here the binarytree is handling the node internally which represents encapsulation

        //it is static because a node object does not need a specific binarytree object to exist

        //Since a node is basically just a data structure used by the tree, making it static is convenient.

        private int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

    private node root;

    // insert element
    public void populate(Scanner scanner) {  //the function of this populate function is to Create the binary tree by taking input from the user.
        System.out.println("enter the root node : ");
        int value = scanner.nextInt();
        root = new node(value);
        populate(scanner, root);
    }


    //here we are doing method overloading we have two function of same name but different parameters 
    //the function of first function is to start the whole process and say create the root then with the help of recursion we call the second populate function which fill the left and right child of the particular node 

    private void populate(Scanner scanner, node node) {
        System.out.println(("do you want to enter left of : " + node.value));
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new node(value);
            populate(scanner, node.left);
        }

        System.out.println(("do you want to enter right of : " + node.value));
        boolean right = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.left = new node(value);
            populate(scanner, node.right);
        }
    }


    //then we have display function

    public void display() {
        display(root, "");
    }

    private void display(node node, String indent) {

        if (node == null) {  //this is base condition for recursion
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.populate(scanner);
        tree.display();
    }
}
