package leetcode.april;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Date08th15Test {
    @Test
    public void testDate08th15Test() {
        Date08th15 date08th15 = new Date08th15();
        int[] param = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> resultList = date08th15.threeSum(param);
        System.out.println(resultList);
    }
}