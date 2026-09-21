package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelordersuc {
    public static void main(String[] args) {
        levelordersuc tree = new levelordersuc();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(tree.findSuccessor(root, 5).val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode.left != null) {
                queue.offer(currNode.left);
            }
            if (currNode.right != null) {
                queue.offer(currNode.right);
            }
            if(currNode.val==key){
                break;
            }
        }
        return queue.peek();
    }
}


//time complexity o(n) because we are using extra queue