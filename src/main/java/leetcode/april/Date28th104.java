package leetcode.april;

import leetcode.TreeNode;

public class Date28th104 {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNum = dfs(node.left);
        int rightNum = dfs(node.right);
        return Math.max(leftNum, rightNum) + 1;
    }
}
