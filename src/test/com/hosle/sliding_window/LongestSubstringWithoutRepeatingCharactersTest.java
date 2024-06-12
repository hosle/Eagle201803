package com.hosle.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void solution() {
        assertEquals(2, new LongestSubstringWithoutRepeatingCharacters().solution("abba"));
        assertEquals(5, new LongestSubstringWithoutRepeatingCharacters().solution("ckilbkd"));
        assertEquals(2, new LongestSubstringWithoutRepeatingCharacters().solution("cdd"));
        assertEquals(0, new LongestSubstringWithoutRepeatingCharacters().solution(""));
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().solution(" "));
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().solution("abcabcbb"));
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().solution("bbbbb"));
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().solution("pwwkew"));
    }
}