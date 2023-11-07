package com.hosle.backtracking;

import com.hosle.backtracking.CharactersPermutation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class CharactersPermutationTest {
    @BeforeAll
    public static void setUp() throws Exception {
    }

    @Test
    public void solution() throws Exception {
        new CharactersPermutation().solution("abcde");
    }

}