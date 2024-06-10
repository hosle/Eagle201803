package com.hosle.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontBackTest {

    @Test
    public void testFrontBack(){
        assertEquals("eodc", new FrontBack().solution("code"));
        assertEquals("a", new FrontBack().solution("a"));
        assertEquals("ab", new FrontBack().solution("ba"));
    }

}