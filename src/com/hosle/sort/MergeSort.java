package com.hosle.sort;

/**
 * Time Complexity: Sorting arrays on different machines.
 * Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
 * T(n) = 2T(n/2) + O(n)
 * The above recurrence can be solved either using Recurrence Tree method or Master method.
 * It falls in case II of Master Method and solution of the recurrence is O(nLogn).
 * Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
 * <p>
 * Stable : yes
 */
public class MergeSort {

    public void solution(int[] input) {

        sort(input, 0, input.length - 1);
    }

    private void sort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        sort(input, start, mid);
        sort(input, mid + 1, end);
//        System.out.println("start=" + start + ",mid = " + mid + ", end = " + end);
        merge(input, start, mid, end);
//        display(input);

    }

    private void merge(int[] input, int start, int mid, int end) {

        int[] temp = new int[end + 1];
        for (int i = start; i <= end; i++) {
            temp[i] = input[i];
        }

        int i = start;
        int j = mid + 1;
        int index = start;

        while (i <= mid && j <= end) {
            if (temp[i] > temp[j]) {
                input[index] = temp[j];
                j++;
            } else {
                input[index] = temp[i];
                i++;
            }
            index++;
        }

        while (i < mid + 1) {
            input[index] = temp[i];
            i++;
            index++;
        }

        while (j <= end) {
            input[index] = temp[j];
            j++;
            index++;
        }

    }

    private void display(int[] input) {

        for (int i1 : input) {
            System.out.print(i1 + " ");
        }

        System.out.println();
    }
}
