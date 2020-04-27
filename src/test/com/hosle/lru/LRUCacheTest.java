package com.hosle.lru;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    private LRUCache lruCache = new LRUCache(3);

    @Test
    public void solution() {
        lruCache.offer(1);
        lruCache.offer(2);
        lruCache.offer(3);
        lruCache.offer(4);

        lruCache.display();

        lruCache.offer(2);
        lruCache.display();

        lruCache.offer(5);
        lruCache.display();

        lruCache.get(2);
        lruCache.display();

    }
}