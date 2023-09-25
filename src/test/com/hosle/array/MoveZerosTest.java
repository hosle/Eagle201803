package test.com.hosle.array;

import com.hosle.array.MoveZeros;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class MoveZerosTest {

    int[] data;

    @AfterAll
    public void tearDown() throws Exception {
        new MoveZeros().solution(data);
        for(int item : data)
        System.out.print(item+",");
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{0,1,0,3,12};
    }

    @Test
    public void solution1() throws Exception {
        data = new int[]{};
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{3};
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{0,0,0,0};
    }

}