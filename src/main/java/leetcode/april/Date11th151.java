package leetcode.april;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Date11th151 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        String result = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            if (Objects.equals(strings[i], "")) {
                continue;
            }
            result = result + strings[i].strip() + " ";
        }
        return result.substring(0, result.length() - 1);
    }
}
