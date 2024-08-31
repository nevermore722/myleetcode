package leetcode.august;

public class Date31th3127 {
    public boolean canMakeSquare(char[][] grid) {
        //判断四个方向是否存在即可
        int n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //枚举右下角
                if (i > 0 && j > 0 && grid[i - 1][j] == grid[i][j - 1] && grid[i][j - 1] == grid[i - 1][j - 1]) {
                    return true;
                }
                //枚举左上角
                if (i < n - 1 && j < m - 1 && grid[i + 1][j] == grid[i][j + 1] && grid[i][j + 1] == grid[i + 1][j + 1]) {
                    return true;
                }
                //左下
                if (i > 0 && j < m - 1 && grid[i - 1][j] == grid[i][j + 1] && grid[i][j + 1] == grid[i - 1][j + 1]) {
                    return true;
                }
                //右上
                if (i < n - 1 && j > 0 && grid[i][j - 1] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 1][j - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
