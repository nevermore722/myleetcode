package leetcode.may;

import leetcode.TreeNode;

public class Date11th112 {

    private int flagNum;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        flagNum = targetSum;
        boolean result = dfs(root);
        return result;
    }

    private boolean dfs(TreeNode node) {
        if (node == null) {
            return false;
        }
        flagNum -= node.val;
        if (node.left == null && node.right == null && flagNum == 0) {
            return true;
        }

        if (node.left != null) {
            boolean leftResult = dfs(node.left);
            if (leftResult) {
                return true;
            }
        }

        if (node.right != null) {
            boolean rightResult = dfs(node.right);
            if (rightResult) {
                return true;
            }
        }
        flagNum += node.val;
        return false;
    }
}
