package leetcode.sep;

public class Date23th1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int dp = values[0];
        int result = 0;
        int index = 0;
        for (int i = 1; i < values.length; i++) {
            result = Math.max(result, values[i] + dp + index - i);
            if (dp + index - i <= values[i]) {
                dp = values[i];
                index = i;
            }
        }
        return result;
    }
}
