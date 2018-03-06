package test.com.hosle.array;

import com.hosle.array.FindDuplicate;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class FindDuplicateTest {

    int[] data;
    int result;

    @After
    public void tearDown() throws Exception {
        result = new FindDuplicate().solution(data);
        System.out.print(result);
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{1,2,1,3,4};
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{1,2,1,4,1};
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{1,2,3,3};
    }

}