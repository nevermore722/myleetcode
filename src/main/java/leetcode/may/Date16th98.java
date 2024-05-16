package leetcode.may;

import leetcode.TreeNode;
import org.apache.commons.lang3.tuple.Pair;

public class Date16th98 {
    private TreeNode preNode = null;

    private boolean result = true;

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        if (preNode != null && preNode.val >= node.val) {
            result = false;
            return;
        }
        preNode = node;
        dfs(node.right);
    }
}
