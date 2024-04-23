package leetcode.april;

public class Date23th1052 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // 1.先将前两个数组遍历一遍得到一定会满意的顾客数量以及可以争取的顾客的数组
        int[] myArr = new int[customers.length];
        int num = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                num += customers[i];
            } else {
                myArr[i] = customers[i];
            }
        }

        // 滑动窗口找myArr中的最大值
        int tmpNum = 0;

        for (int i = 0; i < minutes; i++) {
            tmpNum += myArr[i];
        }
        int maxNum = tmpNum;
        for (int i = 0; i < myArr.length - minutes; i++) {
            tmpNum = tmpNum - myArr[i] + myArr[i + minutes];
            if (tmpNum > maxNum) {
                maxNum = tmpNum;
            }
        }
        return num + maxNum;
    }
}
