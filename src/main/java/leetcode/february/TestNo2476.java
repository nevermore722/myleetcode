package leetcode.february;

//给你一个 二叉搜索树 的根节点 root ，和一个由正整数组成、长度为 n 的数组 queries 。
//
// 请你找出一个长度为 n 的 二维 答案数组 answer ，其中 answer[i] = [mini, maxi] ：
//
//
// mini 是树中小于等于 queries[i] 的 最大值 。如果不存在这样的值，则使用 -1 代替。
// maxi 是树中大于等于 queries[i] 的 最小值 。如果不存在这样的值，则使用 -1 代替。
//
//
// 返回数组 answer 。
//
//
//
// 示例 1 ：
//
//
//
//
//输入：root = [6,2,13,1,4,9,15,null,null,null,null,null,null,14], queries = [2,5,1
//6]
//输出：[[2,2],[4,6],[15,-1]]
//解释：按下面的描述找出并返回查询的答案：
//- 树中小于等于 2 的最大值是 2 ，且大于等于 2 的最小值也是 2 。所以第一个查询的答案是 [2,2] 。
//- 树中小于等于 5 的最大值是 4 ，且大于等于 5 的最小值是 6 。所以第二个查询的答案是 [4,6] 。
//- 树中小于等于 16 的最大值是 15 ，且大于等于 16 的最小值不存在。所以第三个查询的答案是 [15,-1] 。
//
//
// 示例 2 ：
//
//
//
//
//输入：root = [4,null,9], queries = [3]
//输出：[[-1,4]]
//解释：树中不存在小于等于 3 的最大值，且大于等于 3 的最小值是 4 。所以查询的答案是 [-1,4] 。
//
//
//
//
// 提示：
//
//
// 树中节点的数目在范围 [2, 10⁵] 内
// 1 <= Node.val <= 10⁶
// n == queries.length
// 1 <= n <= 10⁵
// 1 <= queries[i] <= 10⁶
//
//
// Related Topics 树 深度优先搜索 二叉搜索树 数组 二分查找 二叉树 👍 52 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class TestNo2476 {

    List<Integer> valueList = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        dfs(root);
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> sortList = valueList.stream().sorted().toList();
        for (Integer query : queries) {
            List<Integer> twoValue = new ArrayList<>();
            getTwoValue(sortList, query, twoValue);
            resultList.add(twoValue);
        }

        return resultList;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode.left == null && treeNode.right == null) {
            valueList.add(treeNode.val);
            return;
        }
        valueList.add(treeNode.val);
        if (treeNode.left != null) {
            dfs(treeNode.left);
        }
        if (treeNode.right != null) {
            dfs(treeNode.right);
        }
    }

    private void getTwoValue(List<Integer> sortList, Integer query, List<Integer> twoValue) {
        if (sortList.get(0) > query) {
            twoValue.add(-1);
            twoValue.add(sortList.get(0));
        } else if (sortList.get(sortList.get(sortList.size())) < query) {
            twoValue.add(sortList.get(sortList.size()));
            twoValue.add(-1);
        }
        for (int i = 0; i < sortList.size(); i++) {


            if (sortList.get(i) <= query && sortList.get(i + 1) >= query) {
                twoValue.add(sortList.get(i));
                twoValue.add(sortList.get(sortList.get(i + 1)));
                break;
            }
        }
    }
}
