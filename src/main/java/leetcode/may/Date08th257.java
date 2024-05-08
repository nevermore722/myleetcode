package leetcode.may;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Date08th257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        dfs(root, new ArrayList<>(), ret);
        return ret;
    }

    private void dfs(TreeNode root, List<String> nodes, List<String> ret) {
        nodes.add(String.valueOf(root.val));
        if (root.left == null && root.right == null) {
            ret.add(String.join("->", nodes));
        }
        if (root.left != null) {
            dfs(root.left, nodes, ret);
        }
        if (root.right != null) {
            dfs(root.right, nodes, ret);
        }
        nodes.remove(nodes.size() - 1);
    }
}
