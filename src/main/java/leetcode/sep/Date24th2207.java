package leetcode.sep;

public class Date24th2207 {
    public long maximumSubsequenceCount(String text, String pattern) {
        char a = pattern.charAt(0), b = pattern.charAt(1);
        char[] cs = text.toCharArray();
        long cnta = 0, cntb = 0;
        long ans = 0;
        for (int i = 0; i < cs.length; i++) {
            char cur = cs[i];
            if (cur == a) {
                cnta++;
            } else if (cur == b) {
                ans += cnta;
                cntb++;
            }
        }
        return a != b ? ans + Math.max(cnta, cntb) : cnta * (cnta - 1) / 2 + cnta;
    }
}
