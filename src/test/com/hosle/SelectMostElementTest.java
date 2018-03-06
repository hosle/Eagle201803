package test.com.hosle;

import com.hosle.SelectMostElement;
import com.hosle.SelectMostElementByAccumulated;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tanjiahao on 2018/3/2.
 * Eagle201803
 */
public class SelectMostElementTest {

    int result = -1;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void solution() throws Exception {
        int[] data =  new int[]{1,2,3,4,4,2,2,3,2,5,33,10,9,8,2};
        result = new SelectMostElement().solution(data);
    }

    @Test
    public void solution2() throws Exception {
        int[] data =  new int[]{1,2,3,4,4,2,2,3,2,5,2,10,2,2,2};
        result = new SelectMostElement().solution(data);
    }

    @Test
    public void solutionAcc1() throws Exception {
        int[] data =  new int[]{1,2,3,4,4,2,2,3,2,5,33,10,9,8,2};
        result = new SelectMostElementByAccumulated().solution(data);
    }

    @Test
    public void solutionAcc2() throws Exception {
        int[] data =  new int[]{1,2,3,4,4,2,2,3,2,5,2,10,2,2,2};
        result = new SelectMostElementByAccumulated().solution(data);
    }

}