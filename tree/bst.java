package tree;

public class bst {
    public class node{
        private int value;
        private int height;
        private node left;
        private node right;

        public node(int value){
            this.value=value;
        }

        public int getvalue(){
            return value;
        }
    }
    private node root;
    public bst(){

    }

    public int height(node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        
    }

    private node insert(int value , node node){
        if(node==null){
            node=new node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }

        if(value>node.value){
            node.left=insert(value,node.right);
        }
    }

    public void display(){
        display(root , "root node : ");
    }

    private void display(node node , String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getvalue());

        display(node.left , "left child of " + node.getvalue() + " : ");
        display(node.right , "left child of " + node.getvalue() + " : ");
    }
}
