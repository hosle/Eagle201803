package test.com.hosle.array;

import com.hosle.array.ProductExceptSelf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class ProductExceptSelfTest {

    int[] result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

        for(int item : result){
            System.out.print(item+",");
        }
    }

    @Test
    public void productExceptSelf() throws Exception {
        result = new ProductExceptSelf().solution(new int[]{1,2,3,4});
    }

    @Test
    public void productExceptSelf2() throws Exception {
        result = new ProductExceptSelf().solution(new int[]{2,2,2});
    }

}