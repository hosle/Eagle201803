package com.hosle.stack;

import java.util.Arrays;

public class StackImpByArray<T> {

    private T[] data;
    private int size = 0;
    private int capacity;

    public StackImpByArray(int cap){
        capacity = cap;
        data = (T[]) new Object[cap];
    }

    public void push(T element){
        ensureCapacity();

        data[size++] = element;
    }

    public T pop(){
        if(size == 0){
            return null;
        }

        T result = data[--size];
        data[size] = null;

        return result;
    }

    public void ensureCapacity(){
        if(data.length == size)
            data = Arrays.copyOf(data, 2* size -1);
    }

}
