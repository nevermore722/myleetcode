package leetcode.may;

import leetcode.TreeNode;

public class Date13th654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return bulidTree(nums, l, r);
    }

    private TreeNode bulidTree(int[] nums, int l, int r) {
        // 递归出口
        if (l > r) return null;
        // 首先找到元素的最大值
        int maxVal = Integer.MIN_VALUE;
        int idx = 0;
        // 遍历nums，注意区间变化
        for (int i = l; i <= r; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                idx = i;
            }
        }
        // 建立根节点
        TreeNode root = new TreeNode(maxVal);
        // 递归构建左子树
        root.left = bulidTree(nums, l, idx - 1);
        // 递归构建右子树
        root.right = bulidTree(nums, idx + 1, r);
        return root;
    }
}
