package leetcode.oct;

public class Date22th3184 {
    public int countCompleteDayPairs(int[] hours) {
        int result = 0;

        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
