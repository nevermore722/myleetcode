package leetcode.may;

import leetcode.TreeNode;

public class Date06th222 {
    int result = 0;

    public int countNodes(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
        result++;
    }
}
