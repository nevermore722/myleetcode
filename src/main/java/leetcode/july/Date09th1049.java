package leetcode.july;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

import java.util.Arrays;

public class Date09th1049 {
    public int lastStoneWeightII(int[] stones) {
        int[] dp = new int[1501];
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[target] - dp[target];
    }
}
