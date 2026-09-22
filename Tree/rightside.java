package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightside {

    public static void main(String[] args) {

        rightside tree = new rightside();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> result = tree.rightSideView(root);

        System.out.println(result);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currNode = queue.poll();
                if (i == levelsize - 1) {
                    result.add(currNode.val);
                }
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
        }
        return result;
    }
}