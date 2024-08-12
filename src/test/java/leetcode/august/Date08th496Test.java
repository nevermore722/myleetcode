package leetcode.august;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date08th496Test {

    @Test
    void nextGreaterElement() {
        Date08th496 date08th496 = new Date08th496();
        int[] result = date08th496.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 2, 3, 4});
        Assertions.assertEquals(-1, result[0]);
        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(3, result[2]);
    }
}