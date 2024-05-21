package leetcode.may;

import leetcode.TreeNode;

public class Date21st701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root ==null){
            return new TreeNode(val);
        }
        dfs(root, val);
        return root;
    }

    private void dfs(TreeNode node, int val) {
        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
                return;
            }
            dfs(node.left, val);
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
                return;
            }
            dfs(node.right, val);
        }
    }
}
