package com.map;

import com.hosle.map.Word0;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
class Word0Test {

    /**
     * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
     * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
     * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */
    @Test
    void word0() {
        HashMap<String,Integer> input = new HashMap<>(Map.of("a", 0, "b",0));
        assertEquals(input, new Word0().word0(new String[]{"a","b","a","b"}));

        HashMap<String,Integer> input2 = new HashMap<>(Map.of("a", 0, "b",0,"c",0));
        assertEquals(input2, new Word0().word0(new String[]{"a","b","a","c","b"}));

        HashMap<String,Integer> input3 = new HashMap<>(Map.of("a", 0, "b",0, "c", 0));
        assertEquals(input3, new Word0().word0(new String[]{"c","b","a"}));
    }
}