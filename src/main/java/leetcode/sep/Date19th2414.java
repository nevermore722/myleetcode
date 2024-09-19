package leetcode.sep;

public class Date19th2414 {
    public int longestContinuousSubstring(String s) {
        int max = 1;//最大连续字符数量
        char[] chars = s.toCharArray();
        int num = 1;//连续字符出现数量
        // 遍历到n-1个字符
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] + 1 != chars[i + 1]) {// 不连续 重置数量
                num = 1;
            } else { //字符连续 计数加1
                num++;
                //计算最大值
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
