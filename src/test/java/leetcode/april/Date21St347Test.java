package leetcode.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Date21St347Test {
    @Test
    void topKFrequent_1() {
        Date21st347 date21St347 = new Date21st347();
        int[] nums = new int[]{4, 1, -1, 2, -1, 2, 3};
        int[] result = date21St347.topKFrequent(nums, 2);
        Assertions.assertEquals(-1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

}