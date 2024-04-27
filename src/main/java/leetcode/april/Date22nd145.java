package leetcode.april;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Date22nd145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);
        return resultList;
    }

    private void dfs(TreeNode cur, List<Integer> resultList) {
        if (cur == null) {
            return;
        }

        dfs(cur.left, resultList);
        dfs(cur.right, resultList);
        resultList.add(cur.val);
    }
}
