package test.com.hosle.backtracking;

import com.hosle.backtracking.SubSets;
import org.junit.After;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 */
public class SubSetsTest {
    int[]data;
    List<List<Integer>> result = null;
    @After
    public void tearDown() throws Exception {
        for(List<Integer> itemList : result){
            for(int item : itemList){
                System.out.print(item+",");
            }
            System.out.println();
        }

    }

    @Test
    public void solution() throws Exception {
        data = new int[]{1,2,3};

        result = new SubSets().solution(data);
    }

}