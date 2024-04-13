package leetcode.april;

public class Date13th459 {
    public boolean repeatedSubstringPattern(String s) {
        int lens = s.length(), i = 0;
        while (++i < lens) {
            if (lens % i != 0) continue;
            if (s.substring(lens - i, lens).equals(s.substring(0, i))) // 判断x是不是基串
                if (s.substring(i, lens).equals(s.substring(0, lens - i))) return true; // 判断拿去x后是否相等
        }
        return false;
    }
}
