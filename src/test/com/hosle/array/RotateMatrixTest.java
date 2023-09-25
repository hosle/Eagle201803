package test.com.hosle.array;

import com.hosle.array.RotateMatrix;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

/**
 * Created by tanjiahao on 2018/3/7.
 * Eagle201803
 */
public class RotateMatrixTest {
    int[][] data;
    int[][] result;
    @AfterAll
    public void tearDown() throws Exception {
        result = new RotateMatrix().solution(data);

        int n = data.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(data[i][j]+",");
            }
            System.out.println();
        }

    }

    @Test
    public void solution() throws Exception {

        int[]row1 = new int[]{1,2,3};
        int[]row2 = new int[]{4,5,6};
        int[]row3 = new int[]{7,8,9};

        data = new int[3][3];
        data[0] = row1;
        data[1] = row2;
        data[2] = row3;

    }
    @Test
    public void solution2() throws Exception {

        data = new int[][]{new int[]{1}};
    }

    @Test
    public void solution3() throws Exception {

        int[]row1 = new int[]{5,1,9,11};
        int[]row2 = new int[]{2,4,8,10};
        int[]row3 = new int[]{13,3,6,7};
        int[]row4 = new int[]{15,14,12,16};

        data = new int[4][4];
        data[0] = row1;
        data[1] = row2;
        data[2] = row3;
        data[3] = row4;

    }

}