package leetcode.april;

import leetcode.TreeNode;

public class Date26th226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;
        TreeNode tmpNode = left;
        node.left = right;
        node.right = tmpNode;
        dfs(left);
        dfs(right);
    }
}
