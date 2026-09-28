//543 diameter of the tree

package Tree;

public class diameterdfs {
    public static void main(String[] args) {
        diameterdfs tree = new diameterdfs();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(tree.diameter(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int diameter=0;
    public int diameter(TreeNode root){
        height(root);
        return diameter-1;
    }

    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);

        int dia=leftheight+rightheight+1;
        diameter=Math.max(diameter,dia);

        return Math.max(leftheight, rightheight)+1;
    }
}
