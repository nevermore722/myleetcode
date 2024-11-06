package leetcode.nov;

public class Date5th3222 {
    public String losingPlayer(int x, int y) {
        // 执行次数
        int rank = 0;
        // 模拟
        while (1 == 1) {
            x -= 1;
            y -= 4;
            rank++;
            if (x < 0 || y < 0) {
                // 无法执行操作，取余
                int mod = rank % 2;
                return mod == 1 ? "Bob" : "Alice";
            }
        }
    }
}
