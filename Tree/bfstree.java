package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfstree {

    public static void main(String[] args) {
        bfstree tree = new bfstree();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = tree.levelorder(root);

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

    public List<List<Integer>> levelorder(TreeNode root) { //we have 2 list because the list of nodes in each level in stored in a list
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();  //we will use queue for storing next element
        queue.offer(root); //this is used to add elements inside queue

        while (!queue.isEmpty()) {
            int levelsize = queue.size(); //this is the soze of the level
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                TreeNode currNode = queue.poll(); //remove and return the element at the front of the queue.
                currentLevel.add(currNode.val);
                if (currNode.left != null) {
                    queue.offer(currNode.left); 
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}