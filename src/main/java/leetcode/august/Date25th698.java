package leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date25th698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 计算每个子集的目标和
        int target = sum / k;

        // 如果不能整除或者最大值大于目标和，直接返回false
        if (sum % k != 0 || nums[nums.length - 1] > target) {
            return false;
        }

        boolean[] used = new boolean[nums.length];
        return backTracking(nums, k, 0, 0, target, used);
    }

    private boolean backTracking(int[] nums, int k, int curSum, int startIndex, int target, boolean[] used) {
        // 当k == 0时，说明所有子集都已正确构建[因为使用数组的平均值来计算的，如果能组成k个，说明元素刚好用完了，就完备了！]
        if (k == 0) {
            return true;
        }

        // 当当前子集和等于目标和时，开始构建下一个子集。直至k=0，很递归！
        if (curSum == target) {
            return backTracking(nums, k - 1, 0, 0, target, used);
        }

        // 当前子集还不等于目标和之时，还需要继续操作
        for (int i = startIndex; i < nums.length; i++) {
            // 当前元素已经不可能在使用了，直接continue开启下一轮树层比较
            if (used[i] || curSum + nums[i] > target) {
                continue;
            }
            // 标记当前元素已经被使用
            used[i] = true;
            // 开启树枝遍历(因为这是有返回值的boolean，所以必须if判断)。如果构建完毕返回true了，就不释放used了。标志着这些位置已经使用，提前返回不再置为false了。
            if (backTracking(nums, k, curSum + nums[i], i + 1, target, used)) {
                return true;
            }
            used[i] = false;
        }
        return false;
    }
}
