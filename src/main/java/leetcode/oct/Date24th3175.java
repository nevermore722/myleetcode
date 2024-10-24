package leetcode.oct;

public class Date24th3175 {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int cnt = 0;
        int winnerID = 0;
        for (int i = 1; i < n; i++) {
            if (skills[winnerID] < skills[i]) {
                winnerID = i;
                cnt = 0;
            }
            cnt++;
            if (cnt == k) return winnerID;
        }
        return winnerID;
    }
}
