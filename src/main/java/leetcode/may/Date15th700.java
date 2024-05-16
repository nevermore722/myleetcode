package leetcode.may;

import leetcode.TreeNode;

public class Date15th700 {
    TreeNode result = null;

    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root, val);
        return result;
    }

    private void dfs(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        if (node.val == val) {
            result = node;
            return;
        }

        if (node.val > val) {
            dfs(node.left, val);
        } else {
            dfs(node.right, val);
        }
    }
}
