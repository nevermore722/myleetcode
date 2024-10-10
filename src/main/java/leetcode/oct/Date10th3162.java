package leetcode.oct;

public class Date10th3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        // 数组长度
        int n = nums1.length;
        int m = nums2.length;
        // 记录个数
        int cnt = 0;
        // 遍历2个数组
        for (int n2 : nums2) {
            for (int n1 : nums1) {
                // 可以整除
                if (n1 % (n2 * k) == 0) {
                    // 个数增加
                    cnt++;
                }
            }
        }
        // 返回个数
        return cnt;
    }
}
