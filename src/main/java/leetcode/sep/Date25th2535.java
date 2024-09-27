package leetcode.sep;

public class Date25th2535 {
    public int differenceOfSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= 10) {
                String numStr = String.valueOf(num);
                result += num;
                for (int j = 0; j < numStr.length(); j++) {
                    result = result - Integer.parseInt(String.valueOf(numStr.charAt(j)));
                }
            }
        }
        return result;
    }
}
