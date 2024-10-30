package leetcode.oct;

public class Date30th3216 {
    public String getSmallestString(String s) {
        char[] charArray = s.toCharArray();
        int lastIndex = 0;
        for (int i = 1; i < charArray.length; i++) {
            int cur = charArray[i];
            int last = charArray[lastIndex];
            if (cur < last && ((cur - last) % 2) == 0) {
                char curChr = charArray[i];
                charArray[i] = charArray[lastIndex];
                charArray[lastIndex] = curChr;
                break;
            } else {
                lastIndex++;
            }
        }
        return String.valueOf(charArray);
    }
}
