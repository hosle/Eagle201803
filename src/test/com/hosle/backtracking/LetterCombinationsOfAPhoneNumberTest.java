package com.hosle.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class LetterCombinationsOfAPhoneNumberTest {

    /**
     * Input: digits = "23"
     *  * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */
    @Test
    void solution() {
        assertEquals(Arrays.asList(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"}), new LetterCombinationsOfAPhoneNumber().solution("23"));
    }
}