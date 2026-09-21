//lc question 103

package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class bfszigzag {

    public static void main(String[] args) {
        bfszigzag tree = new bfszigzag();
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

    public List<List<Integer>> levelorder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                if (!reverse) {
                    TreeNode currNode = queue.pollFirst();
                    currentLevel.add(currNode.val);
                    if (currNode.left != null) {
                        queue.addLast(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.addLast(currNode.right);
                    }
                }
                else{
                    TreeNode currNode = queue.pollLast();
                    currentLevel.add(currNode.val);
                    if (currNode.right != null) {
                        queue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        queue.addFirst(currNode.left);
                    }
                }
            }
            reverse=!reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
