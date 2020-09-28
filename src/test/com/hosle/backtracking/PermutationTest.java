package test.com.hosle.backtracking;

import com.hosle.backtracking.Permutation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class PermutationTest {

    List<List<String>> result;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void solution() throws Exception {
        new Permutation().solution("abcde");
    }

    @Test
    public void solutionForResult() throws Exception {
        result = new Permutation().solutionForList("abcde");

        for(List<String> list:result){
            for(String item: list){
                System.out.print(item+",");
            }
            System.out.println();
        }
    }

    @Test
    public void solution2() {
        new Permutation().solution2(new int[]{1,2,3});
    }

}