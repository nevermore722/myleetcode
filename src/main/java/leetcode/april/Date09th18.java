package leetcode.april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Date09th18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 1.对nums进行排序
        Arrays.sort(nums);
        // 2.for循环遍历nums，使用双指针计算返回的值
        List<List<Integer>> resultList = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            for (int i = k + 1; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                if (nums[i] > 0 && nums[k] > target) {
                    break;
                }
                while (left < right) {
                    int sum = nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        List<Integer> result = Arrays.asList(nums[k], nums[i], nums[left], nums[right]);
                        resultList.add(result);
                        left++;
                        right--;
                    }
                }
            }
        }
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
