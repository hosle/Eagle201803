package com.hosle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 顺时针方向将nxn数组填满
 * input n
 *
 * output:
 * 1  2  3  4  5
 * 16  17  18  19  6
 * 15  24  25  20  7  
 * 14  23  22  21  8
 * 13  12  11  10  9
 */

class RotationMatrixTest {

    @Test
    void solution() {
        new RotationMatrix().solution(5);
    }
}