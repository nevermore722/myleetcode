package leetcode.july;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Date24th188Test {

    @Test
    void maxProfit() {
        Date24th188 date24th188 = new Date24th188();
        int result = date24th188.maxProfit(1, new int[]{1, 2});
        Assertions.assertEquals(1, result);
    }
}