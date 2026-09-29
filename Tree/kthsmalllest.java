//kth smallest element in the binary searhc tree

package Tree;

public class kthsmalllest {
    public static void main(String[] args) {
        kthsmalllest tree = new kthsmalllest();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int kthsmalllestelement(TreeNode root , int k){
        return helper(root,k).val;
    }

    int count=0;
    public TreeNode helper(TreeNode root , int k){
        if(root==null){
            return null;
        }
        TreeNode left=helper(root.left, k);

        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right, k);
    }
}
