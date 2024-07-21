package leetcode.july;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date16th279Test {

    @Test
    void numSquares() {
        Date16th279 date16th279 = new Date16th279();
        int i = date16th279.numSquares(12);
        Assertions.assertEquals(3, i);
    }
}