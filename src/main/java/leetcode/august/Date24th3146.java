package leetcode.august;

public class Date24th3146 {
    public int findPermutationDifference(String s, String t) {
        int n = s.length(), m = t.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < m; j++) {
                if (t.charAt(j) == c) {
                    ans += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}
