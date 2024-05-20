package leetcode.may;

import leetcode.TreeNode;

public class Date19th236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q) {
            return node;
        }
        TreeNode leftNode = dfs(node.left, p, q);
        TreeNode rightNode = dfs(node.right, p, q);

        if (leftNode != null && rightNode != null) {
            return node;
        } else if (leftNode != null) {
            return leftNode;
        } else if (rightNode != null) {
            return rightNode;
        } else {
            return null;
        }
    }
}
