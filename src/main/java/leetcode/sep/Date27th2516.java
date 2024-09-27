package leetcode.sep;

public class Date27th2516 {
    public int takeCharacters(String s, int k) {
        char[] chars = s.toCharArray();
        int[] count = new int[3];
        for (char c : chars)
            count[c - 'a']++;
        if (count[0] < k || count[1] < k || count[2] < k)
            return -1;
        int[] curCount = new int[3];
        int left = 0, right = 0, maxSize = 0;
        //双指针计算中间最大窗口
        while (left < chars.length && right < chars.length) {
            curCount[chars[right++] - 'a']++;
            while (curCount[0] > count[0] - k || curCount[1] > count[1] - k
                    || curCount[2] > count[2] - k) {
                curCount[chars[left++] - 'a']--;
            }
            maxSize = Math.max(maxSize, right - left);
        }
        return s.length() - maxSize;
    }
}
