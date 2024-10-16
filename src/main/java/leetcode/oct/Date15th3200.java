package leetcode.oct;

public class Date15th3200 {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(maxHeight(red, blue), maxHeight(blue, red));
    }

    public int maxHeight(int x, int y) {
        int odd = 2 * (int) (Math.sqrt(x)) - 1;
        int even = 2 * (int) ((-1 + Math.sqrt(1 + 4 * y)) / 2);
        return Math.min(odd, even) + 1;
    }
}
