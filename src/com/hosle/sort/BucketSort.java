package com.hosle.sort;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * We split input array into m buckets uniformly, each bucket contains k = n / m elements.
 * The sorting time complexity in each bucket is O(k*logK).
 * m buckets denotes m * O(k * logk)=m * O((n / m)*log(n / m))=O(nlog(n / m))
 * When m get closer to n, log（n/m）becomes smaller. So the time complexity takes O(n).
 *
 */
public class BucketSort {
    // input from 0 to 1
    public ArrayList<Float> solution(float[] input) {
        ArrayList<LinkedList<Float>> resultList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            resultList.add(new LinkedList<>());
        }

        for (float item : input) {
            int index = (int) (item * 10 / 10);

            resultList.get(index).add(item);
        }

        for (int i = 0; i < 10; i++) {
            LinkedList<Float> bucket = resultList.get(i);
            Collections.sort(bucket);
        }

        ArrayList<Float> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LinkedList<Float> bucket = resultList.get(i);
            result.addAll(bucket);
        }

        return result;
    }

}
