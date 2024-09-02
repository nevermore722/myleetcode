package leetcode.august;

import java.util.HashMap;

public class Date28th3144 {
    public static int minimumSubstringsInPartition(String s) {
        int len = s.length();
        char[] ch = s.toCharArray();
        int[] dp = new int[len];
        for (int i = 0; i < len; i++)
            dp[i] = i + 1; //dp初始值是 每个字符都能单独作一段，那就是i+1

        for (int i = 0; i < len; i++) { //枚举右端点往前找合法左端点。
            //把这段字符串的每个字符都放到 checkMap 里计数。
            HashMap<Character, Integer> checkMap = new HashMap<>();
            for (int j = i; j >= 0; j--) {
                checkMap.put(ch[j], checkMap.getOrDefault(ch[j], 0) + 1); //计数字符

                if ((i - j + 1) % checkMap.size() != 0) continue; //各字符出现次数要是整数
                if (check(checkMap, i - j + 1)) { //平和合法才会进入这个if里
                    if (j == 0) { //合法 且左端点是0，那就是开头到当前 当作一个合法的
                        dp[i] = 1;
                        continue; //避免下面 dp[j - 1] 越界，这里要continue
                    }

                    //能从前面接上，那就记录最小的dp值。
                    dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        return dp[len - 1];
    }

    //判断 这段字符串 是不是平和
    public static boolean check(HashMap<Character, Integer> checkMap, int winLen) {
        int cnt = winLen / checkMap.size();
        for (char c : checkMap.keySet())
            if (checkMap.get(c) != cnt)
                return false;

        return true;
    }
}