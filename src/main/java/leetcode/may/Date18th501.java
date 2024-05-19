package leetcode.may;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Date18th501 {
    List<Integer> list = new ArrayList<>();
    int maxCount;
    TreeNode pre;
    int count;
    public int[] findMode(TreeNode root) {
        tracking(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void tracking(TreeNode node) {
        if (node == null) return;
        tracking(node.left);
        if (pre == null) {
            //第一个节点
            count = 1;
            maxCount = count;
            list.add(node.val);
        } else {
            if (node.val == pre.val) {
                count++;
            } else {
                count = 1;
            }
            if (count == maxCount) {
                list.add(node.val);
            }
            if (count > maxCount) {
                maxCount = count;
                list.clear();
                list.add(node.val);
            }
        }
        pre = node;
        tracking(node.right);
    }

}
