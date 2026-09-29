//lowest common anchestor
package Tree;

public class lowesta {
    public static void main(String[] args) {
        lowesta tree = new lowesta();
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
    public TreeNode lowestcommon(TreeNode root , TreeNode p , TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }

        TreeNode left=lowestcommon(root.left, p, q);
        TreeNode right=lowestcommon(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }

        return left==null? right : left;
    }
}
