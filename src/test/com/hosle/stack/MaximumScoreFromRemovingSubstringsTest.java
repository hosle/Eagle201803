package com.hosle.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class MaximumScoreFromRemovingSubstringsTest {


    @Test
    void solution() {
        assertEquals(19, new MaximumScoreFromRemovingSubstrings().solution("cdbcbbaaabab",4,5));
    }

    @Test
    void solution2() {
        assertEquals(20, new MaximumScoreFromRemovingSubstrings().solution("aabbaaxybbaabb",5,4));
    }

    @Test
    void solution3() {
        assertEquals(112374, new MaximumScoreFromRemovingSubstrings().solution("aabbabkbbbfvybssbtaobaaaabataaadabbbmakgabbaoapbbbbobaabvqhbbzbbkapabaavbbeghacabamdpaaqbqabbjbababmbakbaabajabasaabbwabrbbaabbafubayaazbbbaababbaaha",
                1926,4320));
    }
}