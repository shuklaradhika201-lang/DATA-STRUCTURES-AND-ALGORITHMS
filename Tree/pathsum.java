//question 112 path sum

package Tree;

public class pathsum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean hasPathSum(TreeNode root , int targetsum){
        if(root==null){
            return false;
        }
        if(root.val==targetsum && root.left==null  && root.right==null){
            return true;
        }
        return hasPathSum(root.left, targetsum-root.val) || hasPathSum(root.right, targetsum-root.val);
    }
}
