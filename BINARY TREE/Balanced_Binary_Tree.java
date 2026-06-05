
public class Balanced_Binary_Tree {

    static boolean balanceFactor = true;

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

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1) {
            balanceFactor = false;
        }
        return Math.max(lh, rh) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        int h = height(root);
        return balanceFactor;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        System.out.println(isBalanced(root));
    }
}
