package leetcode.august;

public class Date21th3007 {
    public long findMaximumNumber(long k, int x) {
        // 二分答案，确定上下界
        long left = 1;
        long right = (k + 1) << x - 1;

        long res = 1;
        while (left <= right) {
            // 避免加法溢出
            long mid = ((right - left) >> 1) + left;
            // 获取 [1, mid] 在 x 下的"价值和"
            long count = getCount(mid, x);
            if (count <= k) {
                res = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return res;
    }

    /**
     * 获取 [1, maxNum] 在 x 下的"价值和"
     */
    private long getCount(long maxNum, int x) {
        long res = 0;
        // long 的最大值有 63 位
        for (int i = 1; i <= 63; i++) {
            if (i % x == 0) {
                // 获取每个循环之和
                res += (maxNum + 1) / (1L << i) * (1L << i - 1);
                // 获取可能有的最后一个不完整的循环
                res += Math.max((maxNum + 1) % (1L << i) - (1L << i - 1), 0);
            }
        }

        return res;
    }
}
