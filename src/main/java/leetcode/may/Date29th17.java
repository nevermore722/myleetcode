package leetcode.may;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Date29th17 {

    private String[] strArr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> result = new ArrayList<>();
    String str = "";

    public List<String> letterCombinations(String digits) {
        if (Objects.equals(digits, "")) {
            return result;
        }
        backTracking(digits, 0);
        return result;
    }

    private void backTracking(String digits, int index) {
        if (index == digits.length()) {
            result.add(str);
            return;
        }
        int digit = digits.toCharArray()[index] - '0';
        String letter = strArr[digit];
        for (int i = 0; i < letter.length(); i++) {
            str = str + letter.toCharArray()[i];
            backTracking(digits, index + 1);
            str = str.substring(0, str.length() - 1);
        }
    }
}
