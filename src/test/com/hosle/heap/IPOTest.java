package com.hosle.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPOTest {

    @Test
    void solution() {
        assertEquals(4, new IPO().solution(2,0,new int[]{1,2,3},new int[]{0,1,1}));
    }

    @Test
    void solution1() {
        assertEquals(6, new IPO().solution(3,0,new int[]{1,2,3},new int[]{0,1,2}));
    }

    @Test
    void solution2() {
        assertEquals(0, new IPO().solution(1,0,new int[]{1,2,3},new int[]{1,1,2}));
    }

    @Test
    void solution3() {
        assertEquals(6, new IPO().solution(10,0,new int[]{1,2,3},new int[]{0,1,2}));
    }

    @Test
    void solution4() {
        assertEquals(1, new IPO().solution(2,0,new int[]{1,2,3},new int[]{0,9,10}));
    }
}