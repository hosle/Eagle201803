package com.hosle.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheJumbledNumbersTest {

    @Test
    void solutionIncorrect() {
        assertArrayEquals(new int[]{338,38,991}, new SortTheJumbledNumbers().solutionIncorrect(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,38}));
        assertArrayEquals(new int[]{123,456,789}, new SortTheJumbledNumbers().solutionIncorrect(new int[]{0,1,2,3,4,5,6,7,8,9}, new int[]{789,456,123}));
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{338,38,991}, new SortTheJumbledNumbers().solution(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,38}));
        assertArrayEquals(new int[]{123,456,789}, new SortTheJumbledNumbers().solution(new int[]{0,1,2,3,4,5,6,7,8,9}, new int[]{789,456,123}));
    }
}