package leetcode.may;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Date25th77Test {

    @Test
    void combine() {
        Date25th77 date25th77 = new Date25th77();
        List<List<Integer>> result = date25th77.combine(4, 2);
        Assertions.assertEquals(6,result.size());
    }
}