package leetcode.sep;

import java.util.Arrays;
import java.util.List;

public class Date04th2860 {
    public int countWays(List<Integer> nums) {
        int n = nums.size();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nums.get(i);
        }
        Arrays.sort(a);
        int sum = 1;//默认全选，初始化为1

        for (int i = 0; i < n - 1; i++) {
            if (a[i] < i + 1 && i + 1 < a[i + 1]) sum++;

        }
        if (a[0] != 0) sum++;
        return sum;
    }
}
