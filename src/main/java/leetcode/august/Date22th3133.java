package leetcode.august;

public class Date22th3133 {
    public static long minEnd(int n, int x) {
        n -= 1;
        int i = 0;
        int j = 0;
        long ans = x;
        //将n的值 填充到x位置上的面空的的值
        while ((n >> j) > 0) {
            if (((ans >> i) & 1) == 0) {
                //说明这个位置是空位
                long bit = ((n >> j) & 1);//取出 n这一个位置的值是多少
                // 或上 移动i位的值
                ans |= (long) (bit << i);
                j++;
            }
            i++;
        }
        return ans;
    }
}
