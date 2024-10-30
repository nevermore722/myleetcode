package leetcode.oct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date30th3216Test {

    @Test
    void getSmallestString() {
        Date30th3216 date30th3216 = new Date30th3216();
        String smallestString = date30th3216.getSmallestString("45320");
        Assertions.assertEquals("43520", smallestString);
    }
}