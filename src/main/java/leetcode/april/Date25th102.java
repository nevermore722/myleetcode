package leetcode.april;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Date25th102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        deque.add(root);
        int size = 1;
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int flag = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if (node == null) {
                    continue;
                }
                flag += 2;
                deque.add(node.left);
                deque.add(node.right);
                list.add(node.val);
            }
            size = flag;

            if (!list.isEmpty()) {
                result.add(list);
            }
        }
        return result;
    }
}
