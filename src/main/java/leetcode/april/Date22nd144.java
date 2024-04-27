package leetcode.april;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Date22nd144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);
        return resultList;
    }

    private void dfs(TreeNode cur, List<Integer> resultList) {
        if (cur == null) {
            return;
        }
        resultList.add(cur.val);
        dfs(cur.left, resultList);
        dfs(cur.right, resultList);
    }
}
