package com.hosle;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KSmallestElementWithExtraSpace {

    TreeMap<Integer,Integer> result;

    public TreeMap<Integer,Integer> solution(int[] data, int k){
        result = new TreeMap<>();

        if(k>data.length){
            result.put(-1,-1);
            return result;
        }


        for(int element: data) {
            if (result.size() < k) {
                result.put(element,element);
            }else{
                int largeInSet = result.lastKey();
                if(largeInSet > element){
                    result.remove(largeInSet);
                    result.put(element,element);
                }
            }
        }


        return result;
    }
}
