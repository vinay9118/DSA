//Leetcode 965

public class Univalued_Binary_tree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean helper(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        if (root.val != val) {
            return false;
        }
        return helper(root.left, val) && helper(root.right, val);
    }

    public static boolean isUnivalTree(TreeNode root) {
        return helper(root, root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        System.out.println("UniValued:" + isUnivalTree(root));
    }
}
