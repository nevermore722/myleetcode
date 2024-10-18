package leetcode.oct;

public class Date18th3191 {
    public static int minOperations(int[] nums) {
        int len = nums.length;
        int res = 0;
        for (int i = 0; i <= len - 3; i++) { //只遍历到len-3，防止翻转的下标越界。
            if (nums[i] == 0) { //翻转0的
                res++;
                //翻转3个
                nums[i] = 1;
                nums[i + 1] = (nums[i + 1] == 1 ? 0 : 1);
                nums[i + 2] = (nums[i + 2] == 1 ? 0 : 1);
            }
        }

        //看最后3个是不是合法
        if (!(nums[len - 3] == 1 && nums[len - 2] == 1 && nums[len - 1] == 1)) return -1;
        return res;
    }
}
