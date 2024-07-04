package com.hosle.unionfind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EarliestMomentTest {

    @Test
    void solution() {
        int[][] logs = new int[][]{{0,2,0},{7,4,3}, {2,2,1}, {1,0,1}, {5,4,1}, {6,3,2}, {8,3,1}, {3,0,4} };
        assertEquals(6, new EarliestMoment().solution(logs, 5));
    }

    @Test
    void solution2() {
        int[][] logs = new int[][]{{20190101,0,1},{20190104,3,4}, {20190107,2,3}, {20190211,1,5}, {20190224,2,4}, {20190301,0,3}, {20190312,1,2}, {20190322,4,5} };
        assertEquals(20190301, new EarliestMoment().solution(logs, 6));
    }
}