package leetcode.august;

import java.util.Arrays;
import java.util.Stack;

public class Date09th503 {
    public int[] nextGreaterElements(int[] nums) {
        //边界判断
        if (nums == null || nums.length <= 1) {
            return new int[]{-1};
        }
        int size = nums.length;
        int[] result = new int[size];//存放结果
        Arrays.fill(result, -1);//默认全部初始化为-1
        Stack<Integer> st = new Stack<>();//栈中存放的是nums中的元素下标
        for (int i = 0; i < 2 * size; i++) {
            while (!st.empty() && nums[i % size] > nums[st.peek()]) {
                result[st.peek()] = nums[i % size];//更新result
                st.pop();//弹出栈顶
            }
            st.push(i % size);
        }
        return result;
    }
}
