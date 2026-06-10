//Leetcode 102
import java.util.*;

public class Level_Order2 {

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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currAns = new ArrayList<>();

        if (root == null) {
            return ans;
        }
        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();

        main.add(root);

        while (main.size() > 0) {
            TreeNode currNode = main.remove();
            currAns.add(currNode.val);

            if (currNode.left != null) {
                helper.add(currNode.left);
            }
            if (currNode.right != null) {
                helper.add(currNode.right);
            }
            if (main.size() == 0) {
                ans.add(currAns);
                currAns = new ArrayList<>();
                main = helper;
                helper = new ArrayDeque<>();
            }
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
        System.out.println(levelOrder(root));

    }
}
