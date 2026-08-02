package tree;

import java.util.Scanner;

public class binarytree {
    //we have two way linked representation and sequential using array
    //but we generally dont use sequential using array
    //we will use linked representation using pointers

    public binarytree(){

    }

    private static class node{
        int value;
        node left;
        node right;
        public node(int value){
            this.value=value;
        }
    }

    private node root;

    //insert elements
    public void insert(Scanner scanner){
        System.out.println("enter the root value");
        int value=scanner.nextInt();
        root=new node(value);
        populate(scanner , root);
    }


    private void populate(Scanner scanner , node node){
        System.out.println("do you want to enter left of " + node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left=new node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter left of " + node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.left=new node(value);
            populate(scanner, node.right);
        }
    }
}

