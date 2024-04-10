package leetcode.april;

import java.util.Arrays;

public class Date10th541 {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2 * k) {
            if (i + k <= charArray.length) {
                for (int j = i, h = j + k - 1; j < i + k / 2; j++, h--) {
                    char tmp = charArray[j];
                    charArray[j] = charArray[h];
                    charArray[h] = tmp;
                }
                continue;
            }
            for (int j = i, h = charArray.length - 1; j < (i + charArray.length) / 2; j++, h--) {
                char tmp = charArray[j];
                charArray[j] = charArray[h];
                charArray[h] = tmp;
            }

        }
        return String.valueOf(charArray);
    }
}
