package leetcode.may;

import leetcode.TreeNode;

public class Date22nd450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        return dfs(root, key);
    }

    private TreeNode dfs(TreeNode node, int key) {
        if (node == null) {
            return null;
        }

        if (node.val > key) {
            node.left = dfs(node.left, key);
        }
        if (node.val < key) {
            node.right = dfs(node.right, key);
        }
        if (node.val == key) {
            if (node.left == null && node.right == null) {
                node = null;
                return node;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                TreeNode cur = node.right;
                while(cur.left != null){
                    cur = cur.left;
                }
                node.val = cur.val;
                // 删除右子树的最小值
                node.right = deleteNode(node.right, node.val);
            }
        }

        return node;
    }
}
