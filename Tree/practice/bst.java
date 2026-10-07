package Tree.practice;
import java.util.*;
public class bst {
    private class node{
        private int value;
        node left;
        node right;

        public node(int value){
            this.value=value;
        }
    }

    private node root;

    public void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the node: ");
        int value=sc.nextInt();
        root=insert(value,root);
        while(true){
            System.out.println("do you want to enter another node : ");
            boolean choice=sc.nextBoolean();
            if(!choice){
                break;
            }
            System.out.println("enter the value : ");
            value=sc.nextInt();
            root=insert(value , root);
        }
    }

    private node insert(int value , node node){
        if(node == null){
            return new node(value);
        }

        if(value<node.value){
            node.left=insert(value, node.left);
        }

        if(value>node.value){
            node.right=insert(value, node.right);
        }

        return node;
    }

    public boolean contains(int value){
        return contains(value , root);
    }

    private boolean contains(int value , node node){
        if(node==null){
            return false;
        }
        if(value==node.value){
            return true;
        }

        if(value<node.value){
            return contains(value , node.left);
        }
        return contains(value , node.right);
    }
}
