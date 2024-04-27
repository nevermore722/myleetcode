package leetcode.april;

import leetcode.TreeNode;

public class Date27th101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null && left.val == right.val) {

            boolean leftFlag = dfs(left.left, right.right);
            boolean rightFlag = dfs(left.right, right.left);
            return leftFlag && rightFlag;
        } else {
            return false;
        }
    }
}
