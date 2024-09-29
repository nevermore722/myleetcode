package leetcode.sep;

public class Date29th2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int target = tickets[k];
        int len = tickets.length;
        int t = 0;
        for (int i = 0; i < len; i++) {
            if (tickets[i] < target) {
                ans += tickets[i];
                if (i > k) {
                    t++;
                }
            } else {
                ans += target;
            }
        }
        ans -= (len - k - 1);
        ans += t;
        return ans;
    }
}
