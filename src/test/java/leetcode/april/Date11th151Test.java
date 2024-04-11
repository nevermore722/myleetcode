package leetcode.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date11th151Test {

    @Test
    void reverseWords() {
        Date11th151 date11th151 = new Date11th151();
        String result = date11th151.reverseWords("  hello world  ");
        Assertions.assertEquals("world hello", result);
    }
}