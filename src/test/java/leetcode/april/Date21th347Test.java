package leetcode.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date21th347Test {
    @Test
    void topKFrequent_1() {
        Date21th347 date21th347 = new Date21th347();
        int[] nums = new int[]{4, 1, -1, 2, -1, 2, 3};
        int[] result = date21th347.topKFrequent(nums, 2);
        Assertions.assertEquals(-1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

}