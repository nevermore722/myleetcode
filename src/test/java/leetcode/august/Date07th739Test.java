package leetcode.august;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date07th739Test {

    @Test
    void dailyTemperatures() {
        Date07th739 date07th739 = new Date07th739();
        int[] param = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] ints = date07th739.dailyTemperatures(param);
        Assertions.assertEquals(1,ints[0]);
        Assertions.assertEquals(1,ints[1]);
        Assertions.assertEquals(4,ints[2]);
        Assertions.assertEquals(2,ints[3]);
        Assertions.assertEquals(1,ints[4]);
        Assertions.assertEquals(1,ints[5]);
        Assertions.assertEquals(0,ints[6]);
    }
}