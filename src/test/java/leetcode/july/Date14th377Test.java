package leetcode.july;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date14th377Test {

    @Test
    void combinationSum4() {
        Date14th377 date14th377 = new Date14th377();
        int[] nums = {1, 2, 3};
        int i = date14th377.combinationSum4(nums, 4);
        Assertions.assertEquals(7, i);
    }
}