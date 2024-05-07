package leetcode.may;

import leetcode.TreeNode;

public class Date07th110 {
    public boolean isBalanced(TreeNode root) {
        int result = dfs(root);
        return result != -1;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNum = dfs(node.left);
        int rightNum = dfs(node.right);

        if (leftNum == -1 || rightNum == -1 || Math.abs(leftNum - rightNum) > 1) {
            return -1;
        } else {
            return Math.max(leftNum, rightNum) + 1;
        }
    }
}
