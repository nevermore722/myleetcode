package leetcode.sep;

public class Date21st2347 {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] dis = new long[n + 2];
        for (int i = 0; i < edges.length; i++) {
            dis[edges[i]] += i;
        }
        long max = 0L;
        int node = 0;
        for (int i = 0; i < n; i++) {
            if (dis[i] > max) {
                max = dis[i];
                node = i;
            }
        }
        return node;
    }
}
