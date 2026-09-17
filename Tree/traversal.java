package Tree;
import java.util.*;
class Traversal {  
    private static class node { 
        private int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

    private node root;

    // insert element
    public void populate(Scanner scanner) {  
        System.out.println("enter the root node : ");
        int value = scanner.nextInt();
        root = new node(value);
        populate(scanner, root);
    }
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
    public void display() {
        display(root, "");
    }
    private void display(node node, String indent) {
        if (node == null) {  
            return;
        }
        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    //pre order traversal
    public void preorder(){
        preorder(root);
    }

    private void preorder(node node){
        if(node==null){
            return;
        }
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //in order traversal
    public void inorder(){
        preorder(root);
    }

    private void inorder(node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.value + " ");
        preorder(node.right);
    }

    //post order
    public void postorder(){
        preorder(root);
    }

    private void postorder(node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.populate(scanner);
        tree.display();
    }
}
