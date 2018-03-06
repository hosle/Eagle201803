package test.com.hosle;

import com.hosle.KSmallestElementWithExtraSpace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KSmallestElementWithExtraSpaceTest {

    int[] data;
    TreeMap<Integer,Integer> result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

        for (Map.Entry<Integer, Integer> item : result.entrySet()) {
            System.out.print(item.getKey() + ",");
        }

    }

    @Test
    public void solution() throws Exception {
        data = new int[]{3,4,5,7,6,34,2,1};

        result = new KSmallestElementWithExtraSpace().solution(data,4);

    }

}