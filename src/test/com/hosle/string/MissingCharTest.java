package com.hosle.string;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MissingCharTest {
    @Test
    void testMissingChar() {
        assertEquals("ktten", new MissingChar().missingChar("kitten",1));
        assertEquals("itten", new MissingChar().missingChar("kitten", 0));
        assertEquals("kittn", new MissingChar().missingChar("kitten", 4));
        assertEquals("cod", new MissingChar().missingChar("code", 3));
        assertEquals("chocolat", new MissingChar().missingChar("chocolate", 8));
        assertEquals("cod", new MissingChar().missingChar("code", 3));
        assertEquals("H", new MissingChar().missingChar("Hi", 1));
    }
}