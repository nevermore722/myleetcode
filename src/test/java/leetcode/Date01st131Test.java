package leetcode;

import leetcode.june.Date01st131;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Date01st131Test {

    @Test
    void partition() {
        Date01st131 date01st131 = new Date01st131();
        List<List<String>> result = date01st131.partition("aab");
        System.out.println(result);
        Assertions.assertEquals(2, result.size());
    }
}