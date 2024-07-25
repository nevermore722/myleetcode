package leetcode.july;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Date20th337 {
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (map.containsKey(root)) return map.get(root);
        if (root == null) return 0;

        int val1 = root.val;
        if (root.left != null) val1 += rob(root.left.left) + rob(root.left.right);
        if (root.right != null) val1 += rob(root.right.left) + rob(root.right.right);

        int val2 = rob(root.left) + rob(root.right);

        map.put(root, Math.max(val1, val2));
        return Math.max(val1, val2);
    }
}
