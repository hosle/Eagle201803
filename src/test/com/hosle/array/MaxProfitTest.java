package test.com.hosle.array;

import com.hosle.array.MaxProfit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class MaxProfitTest {

    int result;
    int[] data;

    @AfterAll
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