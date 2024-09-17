package leetcode.sep;

public class Date16th1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0, sum2 = 0;// 区间内，区间外距离和
        int a = Math.min(start, destination), b = Math.max(start, destination);// 从左到右的起始位置和结束位置
        for (int i = 0; i < distance.length; i++) {
            if (i >= a && i < b) {
                sum1 += distance[i];
            } else {
                sum2 += distance[i];
            }
        }
        return Math.min(sum1, sum2);
    }
}
