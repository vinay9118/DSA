//Leetcode 257
import java.util.*;

public class Tree_Path {

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

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        } else if (root.left == null || root.right == null) {
            ans.add("" + root.val);
            return ans;
        }
        List<String> lefts = binaryTreePaths(root.left);
        List<String> rights = binaryTreePaths(root.right);

        for (String str : lefts) {
            ans.add(root.val + "->" + str);
        }
        for (String str : rights) {
            ans.add(root.val + "->" + str);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(binaryTreePaths(root));
    }
}
