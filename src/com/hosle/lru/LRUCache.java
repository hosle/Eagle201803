package com.hosle.lru;

import java.util.LinkedList;

public class LRUCache {

    private LinkedList<Integer> list;
    private int capacity;

    public LRUCache(int capacity) {
        list = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    public void offer(int newItem) {
        if (!visitAndMoveToFirst(newItem)){
            validateSize(1);
            list.add(0, newItem);
        }
    }

    public int get(int pos) {
        if (pos > list.size() - 1 || pos < 0) {
            throw new IllegalArgumentException("pos is too large or too small");
        }
        Integer existingValue = list.get(pos);
        visitAndMoveToFirst(existingValue);
        return existingValue;
    }

    public void display() {
        for (Integer child : list) {
            System.out.print(child + ", ");
        }
        System.out.println();
    }

    private boolean visitAndMoveToFirst(int value) {
        for (int i = 0; i < list.size(); i++) {
            Integer child = list.get(i);

            if (child == value) {
                list.remove(i);
                list.add(0, value);
                return true;
            }
        }
        return false;
    }

    private void validateSize(int keepSpace){
        while (list.size() > capacity - keepSpace){
            list.removeLast();
        }
    }
}
