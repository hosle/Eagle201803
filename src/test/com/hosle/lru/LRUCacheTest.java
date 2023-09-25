package com.hosle.lru;



public class LRUCacheTest {

    private LRUCache lruCache = new LRUCache(3);

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