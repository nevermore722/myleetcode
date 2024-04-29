package leetcode.april;

import leetcode.TreeNode;

public class Date29th111 {
    public int minDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNum = dfs(node.left);
        int rightNum = dfs(node.right);
        if (leftNum == 0 && rightNum != 0) {
            return rightNum + 1;
        } else if (leftNum != 0 && rightNum == 0) {
            return leftNum + 1;
        }
        return Math.min(leftNum, rightNum) + 1;
    }
}
