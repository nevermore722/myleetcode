package leetcode.july;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date29th1143Test {

    @Test
    void longestCommonSubsequence() {
        Date29th1143 date29th1143 = new Date29th1143();
        int i = date29th1143.longestCommonSubsequence("abcde", "ace");
        Assertions.assertEquals(3, i);
    }
}