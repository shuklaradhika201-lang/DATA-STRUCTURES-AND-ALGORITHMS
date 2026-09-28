//maximum depth of bt 104

package Tree;

public class maxdepth {
    public static void main(String[] args) {
        maxdepth tree = new maxdepth();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(tree.maxDepth(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftheight=maxDepth(root.left);
        int rightheight=maxDepth(root.right);

        return Math.max(leftheight,rightheight)+1;
    }
}