package Tree.practice;
import java.util.*;
public class binarytree {
    private static class node{
        private int value;
        node left;
        node right;

        public node(int value){
            this.value=value;
        }
    }

    private node root;
    
    public void populate(Scanner scanner){
        System.out.println("Enter the Root Node : ");
        int value=scanner.nextInt();
        root=new node(value);
        populate(scanner , root);
    }

    private void populate(Scanner scanner , node node){
        System.out.println("Do You want to enter left child of " + node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of the left child of " + node.value);
            int value=scanner.nextInt();
            node.left=new node(value);
            populate(scanner , node.left);
        }

        System.out.println("Do You Want to enter right child of " + node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter the value of the right child of " + node.value);
            int value=scanner.nextInt();
            node.right=new node(value);
            populate(scanner , node.right);
        }
    }

    public void display(){
        display(root , "");
    }

    private void display(node node , String indent){
        if(node==null){
            return ;
        }

        System.out.println(indent + node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        binarytree tree=new binarytree();
        tree.populate(scanner);
        tree.display();
    }
}
