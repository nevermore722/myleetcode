package leetcode.april;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Date23th144 {
    Stack<TreeNode> stack = new Stack<>();

    List<Integer> resultList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        stack.push(root);
        dfs();
        return resultList;
    }

    private void dfs() {
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop == null) {
                continue;
            }

            resultList.add(pop.val);
            stack.push(pop.right);
            stack.push(pop.left);
        }
    }
}
