//给你一个整数数组 nums （下标从 0 开始）和一个整数 k 。
//
// 一个子数组 (i, j) 的 分数 定义为 min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1) 。一个
// 好 子数组的两个端点下标需要满足 i <= k <= j 。
//
// 请你返回 好 子数组的最大可能 分数 。
//
//
//
// 示例 1：
//
// 输入：nums = [1,4,3,7,4,5], k = 3
//输出：15
//解释：最优子数组的左右端点下标是 (1, 5) ，分数为 min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15 。
//
//
// 示例 2：
//
// 输入：nums = [5,5,4,5,4,1,1,1], k = 0
//输出：20
//解释：最优子数组的左右端点下标是 (0, 4) ，分数为 min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20 。
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 10⁵
// 1 <= nums[i] <= 2 * 10⁴
// 0 <= k < nums.length
//
//
// Related Topics 栈 数组 双指针 二分查找 单调栈 👍 128 👎 0

package leetcode.march;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nineteenth1793 {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        //找左边最近的比nums[i]小的 单调递增的栈
        for (int i = 0; i < n; i++) {
            while(stack.size() > 0 && nums[stack.peekLast()] >= nums[i]) {
                stack.pollLast();
            }
            if (stack.size() == 0) {
                left[i] = -1;
            } else {
                left[i] = stack.peekLast();
            }
            stack.addLast(i);
        }
        //栈弹空
        while(stack.size() > 0) {
            stack.pollLast();
        }
        //找右边最近的比nums[i]小的
        for (int i = n - 1; i >= 0; i--) {
            while(stack.size() > 0 && nums[stack.peekLast()] >= nums[i]) {
                stack.pollLast();
            }
            if (stack.size() == 0) {
                right[i] = n;
            } else {
                right[i] = stack.peekLast();
            }
            stack.addLast(i);
        }
        //遍历 更新答案
        for (int i = 0; i < n; i++) {
            if (left[i] + 1 <= k && right[i] - 1 >= k) {
                res = Math.max(res, nums[i] * (right[i] - left[i] - 1));
            }
        }
        return res;
    }
}
