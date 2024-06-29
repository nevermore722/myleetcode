package leetcode.june;

import leetcode.TreeNode;

public class Date27th968 {

    //全局变量 摄像头个数
    int res = 0;

    public int minCameraCover(TreeNode root) {
        if (judge(root) == 0) res++;
        return res;
    }

    public int judge(TreeNode root) {
        //如果是空节点返回 已被监控
        //这样叶子节点就是 未被监控
        if (root == null) return 2;
        //根据左右孩子判断本节点属性
        int left = judge(root.left);
        int right = judge(root.right);
        //左右有一个 未被监控 则为摄像头
        if (left == 0 || right == 0) {
            res++;
            return 1;
        }
        //左右有一个 摄像头 则为已被监控
        if (left == 1 || right == 1) return 2;
        //剩下为左右都 已被监控 则为未被监控 交给上一层节点添加摄像头
        return 0;
    }


}
