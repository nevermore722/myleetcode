package leetcode.april;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Date22nd94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);
        return resultList;
    }

    private void dfs(TreeNode cur, List<Integer> resultList) {
        if (cur == null) {
            return;
        }

        dfs(cur.left, resultList);
        resultList.add(cur.val);
        dfs(cur.right, resultList);
    }
}
