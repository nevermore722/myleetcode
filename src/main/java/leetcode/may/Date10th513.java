package leetcode.may;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Date10th513 {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int ans = 0;
        while (!d.isEmpty()) {
            int sz = d.size();
            ans = d.peek().val;
            while (sz-- > 0) {
                TreeNode poll = d.pollFirst();
                if (poll.left != null) d.addLast(poll.left);
                if (poll.right != null) d.addLast(poll.right);
            }
        }
        return ans;
    }
}
