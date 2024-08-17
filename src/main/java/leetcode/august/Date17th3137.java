package leetcode.august;

import java.util.HashMap;
import java.util.Map;

public class Date17th3137 {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length();
        Map<String, Integer> cnt = new HashMap<>();
        int maxCnt = 0;
        for (int i = 0; i < n; i += k) {
            String wi = word.substring(i, i + k);
            cnt.merge(wi, 1, Integer::sum);
            maxCnt = Math.max(maxCnt, cnt.get(wi));
        }
        return n / k - maxCnt;
    }
}
