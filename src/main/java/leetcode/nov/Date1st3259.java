package leetcode.nov;

public class Date1st3259 {
    private long[][] memo;
    private int[] DrinkA;
    private int[] DrinkB;

    public long maxEnergyBoost(int[] DrinkA, int[] DrinkB) {
        this.DrinkA = DrinkA;
        this.DrinkB = DrinkB;
        int n = DrinkA.length;
        memo = new long[n][2];
        for (int i = 0; i < n; i++) {
            memo[i][0] = -1;
            memo[i][1] = -1;
        }
        // 入口
        return Math.max(dfs(n - 1, 0), dfs(n - 1, 1));
    }

    private long dfs(int i, int j) {
        if (i < 0) { // 边界
            return 0;
        }
        if (memo[i][j] != -1) { // 检查是否已经计算过
            return memo[i][j];
        }
        // 根据 j 值直接选择 DrinkA 或 DrinkB
        if (j == 0) {
            memo[i][j] = Math.max(dfs(i - 1, 0), dfs(i - 2, 1)) + DrinkA[i];
        } else {
            memo[i][j] = Math.max(dfs(i - 1, 1), dfs(i - 2, 0)) + DrinkB[i];
        }
        return memo[i][j];
    }

}
