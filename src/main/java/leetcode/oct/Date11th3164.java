package leetcode.oct;

import java.util.HashMap;
import java.util.Map;

public class Date11th3164 {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums1) {
            if (num % k != 0) continue;
            num /= k;
            for (int d = 1; d * d <= num; d++) {
                if (num % d == 0) {
                    cnt.merge(d, 1, (a, b) -> a + b);
                    if (d * d < num) cnt.merge(num / d, 1, (a, b) -> a + b);
                }
            }
        }
        long res = 0L;
        for (int num : nums2) {
            res += cnt.getOrDefault(num, 0);
        }
        return res;
    }
}
