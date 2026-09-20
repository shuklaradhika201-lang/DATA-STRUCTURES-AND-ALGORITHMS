package Tree;

public class segmenttree {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        segmenttree tree=new segmenttree(arr);
        tree.display();
    }

    private static class node{
        int data;
        int startinterval;
        int endinterval;
        node left;
        node right;

        public node(int startinterval , int endinterval){
            this.startinterval=startinterval;
            this.endinterval=endinterval;
        }
    }

    node root;

    public segmenttree(int[] arr){
        //create a tree using this array
        this.root=constructTree(arr,0,(arr.length-1));
    }

    private node constructTree(int[] arr , int start , int end){
        if(start==end){
            //leaf node
            node leaf=new node(start,end);
            leaf.data=arr[start];
            return leaf;
        }

        //create new node with the index u are at
        node node=new node(start,end);
        int mid=(start+end)/2;

        node.left=this.constructTree(arr, start, mid);
        node.right=this.constructTree(arr, mid+1, end);

        node.data=node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(node node){
        String str="";
        if(node.left != null){
            str=str + "Interval = [" + node.left.startinterval +  "-" + node.left.endinterval + "] and data : " +  node.left.data + " + ->" ;
        }

        else{
            str=str+ "no left child";
        }

        //for current node
        str=str + "Interval = [" + node.startinterval +  "-" + node.endinterval + "] and data : " +  node.data + " + ->" ;

        if(node.right != null){
            str=str + "Interval = [" + node.right.startinterval +  "-" + node.right.endinterval + "] and data : " +  node.right.data + " + ->" ;
        }

        else{
            str=str+ "no right child";
        }

        System.out.println(str);

        //call recursion
        if(node.left !=null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }

    public int query(int qsi , int qei){
        return this.query(this.root , qsi , qei);
    }

    private int query(node node , int qsi , int qei){
        if(node.startinterval>=qsi && node.endinterval<=qei){
            //node is completely laying inside query
            return node.data;
        }
        else if(node.startinterval>qei || node.endinterval<qsi){
            return 0;
            //it is completely outside
        }

        else{
            return this.query(node.left , qsi , qei) + this.query(node.right , qsi , qei);
        }
    }

    //update
    public void update(int index , int value){
        this.root.data=update(this.root , index , value);
    }

    private int update(node node,int index , int value){
        if(index >=node.startinterval  && index <=node.endinterval){
            if(index==node.startinterval && index==node.endinterval){
                node.data=value;
                return node.data;
            }
            else{
                int leftans=update(node.left , index , value);
                int rightans=update(node.right, index , value);
                node.data=leftans + rightans;
                return node.data;
            }
        }
        return node.data;
    }


}
