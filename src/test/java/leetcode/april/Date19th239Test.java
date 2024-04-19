package leetcode.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date19th239Test {

    @Test
    void maxSlidingWindow() {
        Date19th239 date19th239 = new Date19th239();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = date19th239.maxSlidingWindow(nums, 3);
        Assertions.assertEquals(3, result[0]);
        Assertions.assertEquals(3, result[1]);
        Assertions.assertEquals(5, result[2]);
        Assertions.assertEquals(5, result[3]);
        Assertions.assertEquals(6, result[4]);
        Assertions.assertEquals(7, result[5]);
    }

    @Test
    void maxSlidingWindow_2() {
        Date19th239 date19th239 = new Date19th239();
        int[] nums = new int[]{-7, -8, 7, 5, 7, 1, 6, 0};
        int[] result = date19th239.maxSlidingWindow(nums, 4);
        Assertions.assertEquals(7, result[0]);
        Assertions.assertEquals(7, result[1]);
        Assertions.assertEquals(7, result[2]);
        Assertions.assertEquals(7, result[3]);
        Assertions.assertEquals(7, result[4]);
    }

    @Test
    void maxSlidingWindow_3() {
        Date19th239 date19th239 = new Date19th239();
        int[] nums = new int[]{1, -1};
        int[] result = date19th239.maxSlidingWindow(nums, 1);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(-1, result[1]);
    }

    @Test
    void maxSlidingWindow_4() {
        Date19th239 date19th239 = new Date19th239();
        int[] nums = new int[]{9, 10, 9, -7, -4, -8, 2, -6};
        int[] result = date19th239.maxSlidingWindow(nums, 5);
        Assertions.assertEquals(10, result[0]);
        Assertions.assertEquals(10, result[1]);
        Assertions.assertEquals(9, result[2]);
        Assertions.assertEquals(2, result[3]);
    }
}