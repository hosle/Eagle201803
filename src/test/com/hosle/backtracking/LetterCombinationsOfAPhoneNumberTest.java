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
        assertEquals(Arrays.asList(new String[]{}), new LetterCombinationsOfAPhoneNumber().solution(""));
        assertEquals(Arrays.asList(new String[]{"a","b","c"}), new LetterCombinationsOfAPhoneNumber().solution("2"));
        assertEquals(Arrays.asList(new String[]{"adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"}),
                new LetterCombinationsOfAPhoneNumber().solution("234"));
    }
}