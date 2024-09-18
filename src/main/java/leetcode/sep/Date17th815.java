package leetcode.sep;

import java.util.*;

public class Date17th815 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;
        // 单向BFS
        int n = routes.length;
        // 处理各线路之前的连接关系
        Map<Integer, List<Integer>> map = new HashMap<>();
        // 记录可作为点线路
        Deque<Integer> que = new ArrayDeque<>();
        // 记录到达每条线路的线路数量
        Map<Integer, Integer> dist = new HashMap<>();
        for (int i = 0; i < n; i++) { // 线路
            for (int site : routes[i]) { // 站点
                // 处理每个站点能到的线路
                List<Integer> list = map.getOrDefault(site, new ArrayList<>());
                list.add(i);
                map.put(site, list);
                // 判断是否可以作为起点
                if (site == source) {
                    que.addLast(i);
                    dist.put(i, 1);
                }
            }
        }
        // 展开搜索
        while (!que.isEmpty()) {
            int line0 = que.pollFirst();
            int step = dist.get(line0);
            // 通过线路遍历车站,再由车站延展到其他线路,执行BFS逻辑
            for (int site : routes[line0]) {
                if (site == target) return step;
                // 延展到其他没去过的线路
                for (int line1 : map.getOrDefault(site, new ArrayList<>())) {
                    if (!dist.containsKey(line1)) {
                        dist.put(line1, step + 1);
                        que.addLast(line1);
                    }
                }
            }
        }
        return -1;
    }
}
