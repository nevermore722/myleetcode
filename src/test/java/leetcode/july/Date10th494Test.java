package leetcode.july;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date10th494Test {

    @Test
    void findTargetSumWays() {
        Date10th494 date10th494 = new Date10th494();
        int[] nums = {1, 1, 1, 1, 1};
        int result = date10th494.findTargetSumWays(nums, 3);

//        int[] nums = {100};
//        int result = date10th494.findTargetSumWays(nums, -200);
        Assertions.assertEquals(5, result);
    }
}