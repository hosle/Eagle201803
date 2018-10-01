package com.hosle.array;

/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3,
 *
 * the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 * How many different ways do you know to solve this problem?
 *
 * https://www.programcreek.com/2015/03/rotate-array-in-java/
 */
public class RotateArray {

    public int[] solution1(int[] data, int k, int n) {
        int[] result = new int[n];
        for (int i = 0; i < data.length; i++) {
            result[(i + k) % n] = data[i];
        }
        return result;
    }

    public void solution2(int[] data, int k, int n){
        if(data == null || data.length ==0 || k<0 || k>n){
            throw new IllegalArgumentException("");
        }

        int index = n - k;

        reverse(data, 0, index);// 4321 567
        reverse(data, index ,n);//4321 765
        reverse(data,0, n);// 5671234
    }

    private void reverse(int[] data, int start, int end){
        int i = start;
        int j = end - 1;

        while(i<j){
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }
    }
}
