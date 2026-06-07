//Leetcode 103

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_ZigZag {

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

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        List<Integer> currAns = new ArrayList<>();

        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        int level = 0;

        main.push(root);
        while (main.size() > 0) {
            TreeNode currNode = main.pop();

            currAns.add(currNode.val);

            if (level == 0) {
                if (currNode.left != null) {
                    helper.push(currNode.left);
                }
                if (currNode.right != null) {
                    helper.push(currNode.right);
                }
            } else {
                if (currNode.right != null) {
                    helper.push(currNode.right);
                }
                if (currNode.left != null) {
                    helper.push(currNode.left);
                }
            }
            if (main.size() == 0) {
                ans.add(currAns);
                currAns = new ArrayList<>();
                level = 1 - level;

                main = helper;
                helper = new Stack<>();

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
        System.out.println(zigzagLevelOrder(root));
    }
}
