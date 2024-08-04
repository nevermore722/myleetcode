package leetcode.august;

public class Date01st392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < t.length(); ) {
            for (int j = 0; j < s.length(); ) {
                if (t.charAt(i) == s.charAt(j)) {
                    j++;
                    i++;
                } else {
                    i++;
                }
                if (j == s.length()) {
                    return true;
                }
                if (i == t.length()) {
                    return false;
                }
            }
        }
        return false;
    }
}
