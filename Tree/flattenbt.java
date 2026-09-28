//114 flatten binary tree to linked list

package Tree;

public class flattenbt {
    public static void main(String[] args) {
        flattenbt tree = new flattenbt();
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

    public void flatten(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode current=root;
        while(current!=null){
            if(current.left!=null){
                TreeNode temp=current.left;
                while(temp.right != null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }
}
