package leetcode.march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Fifth1976 {

    public int countPaths(int n, int[][] roads) {
        int mod = 1000000007;
        // 以邻接表的形式记录无向图
        List<int[]>[] g = new List[n];
        Arrays.setAll(g, e -> new ArrayList<int[]>());
        for (int[] rs : roads) {
            int a = rs[0];
            int b = rs[1];
            // c表示a->b的路径时间
            int c = rs[2];
            g[a].add(new int[]{b, c});
            g[b].add(new int[]{a, c});
        }

        // dist[i]表示由源节点到i的最短路径长度，用以做dijstra算法
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        // 构建小根堆优先级队列，其中每个节点有两个元素
        // 第一个元素指节点，第二个元素指源到当前节点的最短路径长度
        PriorityQueue<long[]> que = new PriorityQueue<long[]>((a, b) -> Long.compare(a[1], b[1]));
        // 下标1为最短路径长度，0为源到最短路径长度所表示的点
        que.offer(new long[]{0, 0});
        // dp[i]表示源节点0到节点i的最短路径个数
        int[] dp = new int[n];
        dp[0] = 1;
        while (!que.isEmpty()) {
            long[] tmp = que.poll();
            long time = tmp[1];
            int v = (int) tmp[0];

            // 如果上一节点到当前节点的路径长度比源节点到当前节点
            // 还要长，那就没必要再加上当前节点
            if (time > dist[v]) continue;

            // 遍历当前节点的相邻节点
            for (int[] node : g[v]) {
                int next = node[0];
                int t = node[1];
                // 更新源到下一节点最短路径长度
                if (time + t < dist[next]) {
                    dist[next] = time + t;
                    que.offer(new long[]{next, dist[next]});
                    dp[next] = dp[v];
                } else if (time + t == dist[next]) {
                    dp[next] = (dp[next] + dp[v]) % mod;
                }
            }
        }

        return dp[n - 1];
    }
}
