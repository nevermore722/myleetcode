package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Date01st131 {
    List<List<String>> result = new ArrayList<>();
    List<String> list = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return result;
    }

    private void backTracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (!isPalindrome(s, startIndex, i)) {
                continue;
            }
            list.add(s.substring(startIndex, i+1));

            backTracking(s, i + 1);
            list.remove(list.size() - 1);
        }

    }

    private boolean isPalindrome(String s, int startIndex, int endIndex) {
        for (int i = 0; i <= (endIndex - startIndex) / 2; i++) {
            if (s.charAt(startIndex + i) != s.charAt(endIndex - i)) {
                return false;
            }
        }
        return true;
    }
}
