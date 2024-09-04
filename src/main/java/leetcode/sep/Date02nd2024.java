package leetcode.sep;

public class Date02nd2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0;
        int[] cnt = new int[2];
        char[] arr = answerKey.toCharArray();
        for (int l = 0, r = 0; r < arr.length; r++) {
            cnt[arr[r] >> 1 & 1]++;
            while (cnt[0] > k && cnt[1] > k) {
                cnt[arr[l++] >> 1 & 1]--;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
