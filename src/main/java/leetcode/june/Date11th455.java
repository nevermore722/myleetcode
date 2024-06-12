package leetcode.june;

import java.util.Arrays;

public class Date11th455 {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int index = s.length - 1;
        for (int i = g.length - 1; i >= 0; i--) {
            while (index >= 0 && s[index] >= g[i]) {
                result++;
                index--;
                break;
            }
        }
        return result;
    }
}
