//lc 993
//Two nodes are cousins if they are at the same level AND they are NOT siblings


//Find the two nodes → check they are at the same level → check they don't have the same parent → cousins.

package Tree;

public class cousionbt {

    public static void main(String[] args) {
        cousionbt tree = new cousionbt();
        node root = new node(1);

        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(7);

        System.out.println(tree.iscousion(root, 4, 7));
    }

    public static class node {
        int val;
        node left;
        node right;
        node next;

        node(int val) {
            this.val = val;
        }
    }

    public boolean iscousion(node root, int x, int y) {
        node xx = findnode(root, x);
        node yy = findnode(root, y);

        return ((level(root, xx, 0) == level(root, yy, 0)) && (!issibling(root, xx, yy)));
    }

    node findnode(node node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        node n = findnode(node.left, x);
        if (n != null) {
            return n;
        }
        return findnode(node.right, x);
    }

    boolean issibling(node node, node x, node y) {
        if (node == null) {
            return false;
        }
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x) || issibling(node.left, x, y)
                || issibling(node.right, x, y));
    }

    int level(node node, node x, int lev) {
        if (node == null) {
            return 0;
        }
        if (node == x) {
            return lev;
        }
        int l = level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }
        return level(node.right, x, lev + 1);
    }
}
