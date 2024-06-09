package leetcode.june;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Date08th51Test {

    @Test
    void solveNQueens() {
        Date08th51 date08th51 = new Date08th51();
        List<List<String>> lists = date08th51.solveNQueens(4);
        Assertions.assertEquals(2, lists.size());
    }
}