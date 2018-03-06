package test.com.hosle.array;

import com.hosle.array.UniquePaths;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class UniquePathsTest {
    int m,n;
    int result;

    @After
    public void tearDown() throws Exception {
        result = new UniquePaths().solution(m,n);
        System.out.print(result);

    }

    @Test
    public void solution() throws Exception {
        m = 2;
        n = 2;
    }

    @Test
    public void solution2() throws Exception {
        m = 1;
        n = 2;
    }

    @Test
    public void solution3() throws Exception {
        m = 3;
        n = 2;
    }

    @Test
    public void solution4() throws Exception {
        m = 23;
        n = 12;
    }

}