package leetcode.may;

import leetcode.TreeNode;

public class Date09th404 {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //树为空直接返回0
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }//题目中说的左叶子需要注意！！！  叶子节点指左右子节点都为空
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
