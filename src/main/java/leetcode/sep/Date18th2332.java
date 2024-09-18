package leetcode.sep;

import java.util.Arrays;
import java.util.HashSet;

public class Date18th2332 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int ans = 0;

        HashSet<Integer> pset = new HashSet(); // 用于判断是否可以在乘客 i 前上车
        for (int i : passengers) {
            pset.add(i);
        }

        for (int i = 0, j = 0; i < buses.length; i++) { // i 表示车， j 表示乘客
            int in = 0;
            while (in < capacity && j < passengers.length && passengers[j] <= buses[i]) {  // 如果车 i 还有位置
                if (!pset.contains(passengers[j] - 1) && passengers[j] - 1 <= buses[i]) {  // 如果可以在某乘客前上车(passengers[j] - 1)
                    ans = Math.max(ans, passengers[j] - 1);
                }

                j++;
                in++;
            }
            if (in < capacity && !pset.contains(buses[i])) {  // 是否可以卡点上车(车来了再上车)
                ans = Math.max(ans, buses[i]);
            }

        }
        return ans;
    }
}
