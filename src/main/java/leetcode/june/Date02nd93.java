package leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class Date02nd93 {
    List<String> result = new ArrayList<>();
    String str = "";

    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        str = s;
        backTracking(0, "", 4, n);
        return result;
    }

    private void backTracking(int i, String tmp, int flag, int n) {
        if (i == n && flag == 0) {
            result.add(tmp.substring(0, tmp.length() - 1));
            return;
        }
        if (flag < 0) {
            return;
        }
        for (int j = i; j < i + 3; j++) {
            if (j < n) {
                if (i == j && str.charAt(j) == '0') {
                    backtrack(j + 1, tmp + str.charAt(j) + ".", flag - 1, n);
                    break;
                }
                if (Integer.parseInt(str.substring(i, j + 1)) <= 255) {
                    backtrack(j + 1, tmp + str.substring(i, j + 1) + ".", flag - 1, n);
                }
            }
        }
    }
}
