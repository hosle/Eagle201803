package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    void solution1() {
        assertEquals(3, new LongestCommonSubsequence().solution1("abcde","ace"));
        assertEquals(3, new LongestCommonSubsequence().solution1("abc","abc"));
        assertEquals(0, new LongestCommonSubsequence().solution1("abc","def"));

        assertEquals(3, new LongestCommonSubsequence().solution2("abcde","ace"));
        assertEquals(3, new LongestCommonSubsequence().solution2("abc","abc"));
        assertEquals(0, new LongestCommonSubsequence().solution2("abc","def"));


    }

    int[][] intermediate = new int[20][20];

    @BeforeEach
    void beforesolution3(){
        for (int i = 0; i < intermediate.length; i++){
            for (int j = 0; j < intermediate[0].length; j++){
                intermediate[i][j] = -1;
            }
        }
    }

    @Test
    void solution30(){
        assertEquals(3, new LongestCommonSubsequence().solution3("abcde","ace", intermediate));
    }

    @Test
    void solution31(){
        assertEquals(3, new LongestCommonSubsequence().solution3("abc","abc", intermediate));
    }

    @Test
    void solution32(){
        assertEquals(0, new LongestCommonSubsequence().solution3("abc","def", intermediate));
    }
}