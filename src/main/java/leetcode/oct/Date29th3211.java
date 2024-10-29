package leetcode.oct;

import java.util.ArrayList;
import java.util.List;

public class Date29th3211 {
    List<String> result = new ArrayList<>();
    int n;

    public List<String> validStrings(int n) {
        this.n = n;
        dfs(new StringBuilder(), '1');
        return result;
    }

    private void dfs(StringBuilder sb, char last) {
        if (n == sb.length()) {
            result.add(sb.toString());
            return;
        }
        char chr = '1';
        if (chr == last) {
            chr = '0';
        }
        for (; chr <= '1'; chr++) {
            sb.append(chr);
            dfs(sb, chr);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
