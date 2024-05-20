package leetcode.may;

import leetcode.TreeNode;

public class Date20th235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        if (node.val < p.val && node.val < q.val) {
            TreeNode leftNode = dfs(node.left, p, q);
            if (leftNode != null) {
                return leftNode;
            }
        }

        if (node.val > p.val && node.val > q.val) {
            TreeNode rightNode = dfs(node.right, p, q);
            if (rightNode != null) {
                return rightNode;
            }
        }
        return node;
    }
}
