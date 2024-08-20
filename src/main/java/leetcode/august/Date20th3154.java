package leetcode.august;

import java.util.HashMap;
import java.util.Map;

public class Date20th3154 {
    private Map<Long, Integer> memo;
    private int k;

    public int waysToReachStair(int k) {
        memo = new HashMap<>();
        this.k = k;
        return dfs(1, 0, 1);
    }

    private int dfs(int nowStep, int jump, int canDesc) {
        if (nowStep >= k + 2) return 0;
        long key = (long) nowStep << 32 | jump << 1 | canDesc;
        if (memo.getOrDefault(key, -1) != -1) return memo.getOrDefault(key, -1);
        int res = (nowStep == k ? 1 : 0);
        if (canDesc == 1 && nowStep > 0) res += dfs(nowStep - 1, jump, 0);
        res += dfs(nowStep + (1 << jump), jump + 1, 1);
        memo.put(key, res);
        return memo.get(key);
    }
}
