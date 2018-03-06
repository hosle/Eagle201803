package test.com.hosle.string;

import com.hosle.string.ReverseString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class ReverseStringTest {

    String result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void solution() throws Exception {
        result = new ReverseString().solution("");
    }


    @Test
    public void solution2() throws Exception {
        result = new ReverseString().solution(null);
    }


    @Test
    public void solution3() throws Exception {
        result = new ReverseString().solution("abcde");
    }


    @Test
    public void solution4() throws Exception {
        result = new ReverseString().solution("a b");
    }

}