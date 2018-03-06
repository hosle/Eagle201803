package test.com.hosle.array;

import com.hosle.array.MaxProfit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class MaxProfitTest {

    int result;
    int[] data;

    @After
    public void tearDown() throws Exception {
        result = new MaxProfit().solution(data);
        System.out.print(result);
    }

    @Test
    public void solution0() throws Exception {
        data = new int[]{};
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{1,2,3,5,4,7,9,6};
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{6,6,6,6,6,6};
    }



}