package Tree.practice;

import java.util.*;

import Tree.bfstree;

public class bfstraversal {

    // public static void main(String[] args) {
    //     bfstree tree = new bfstree();
    //     TreeNode root = new TreeNode(1);

    //     root.left = new TreeNode(2);
    //     root.right = new TreeNode(3);

    //     root.left.left = new TreeNode(4);
    //     root.left.right = new TreeNode(5);

    //     root.right.left = new TreeNode(6);
    //     root.right.right = new TreeNode(7);

    //     List<List<Integer>> result = tree.levelorder(root);

    //     System.out.println(result);
    // }

    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val){
            this.val=val;
        }
    }
    
    public List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currnode=queue.poll();
                currentLevel.add(currnode.val);
                if(currnode.left!=null){
                    queue.offer(currnode.left);
                }
                if(currnode.right!=null){
                    queue.offer(currnode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
