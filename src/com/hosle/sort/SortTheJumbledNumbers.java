package com.hosle.sort;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-the-jumbled-numbers/description/
 * <p>
 * You are given a 0-indexed integer array mapping which represents the mapping rule of a shuffled decimal system. mapping[i] = j means digit i should be mapped to digit j in this system.
 * <p>
 * The mapped value of an integer is the new integer obtained by replacing each occurrence of digit i in the integer with mapping[i] for all 0 <= i <= 9.
 * <p>
 * You are also given another integer array nums. Return the array nums sorted in non-decreasing order based on the mapped values of its elements.
 * <p>
 * Notes:
 * <p>
 * Elements with the same mapped values should appear in the same relative order as in the input.
 * The elements of nums should only be sorted based on their mapped values and not be replaced by them.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: mapping = [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
 * Output: [338,38,991]
 * Explanation:
 * Map the number 991 as follows:
 * 1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
 * 2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.
 * Therefore, the mapped value of 991 is 669.
 * 338 maps to 007, or 7 after removing the leading zeros.
 * 38 maps to 07, which is also 7 after removing leading zeros.
 * Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
 * Thus, the sorted array is [338,38,991].
 * Example 2:
 * <p>
 * Input: mapping = [0,1,2,3,4,5,6,7,8,9], nums = [789,456,123]
 * Output: [123,456,789]
 * Explanation: 789 maps to 789, 456 maps to 456, and 123 maps to 123. Thus, the sorted array is [123,456,789].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * mapping.length == 10
 * 0 <= mapping[i] <= 9
 * All the values of mapping[i] are unique.
 * 1 <= nums.length <= 3 * 104
 * 0 <= nums[i] < 109
 */
public class SortTheJumbledNumbers {

    public int[] solution(int[] mapping, int[] nums) {
        int[][] indexForSorting = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            int ori = nums[i];
            int mappedNum = 0;
            int digit = 1;
            indexForSorting[i][0] = ori;

            if (ori == 0) {
                mappedNum = mapping[ori];
            }
            while (ori > 0) {
                mappedNum = mappedNum + mapping[ori % 10] * digit;
                ori = ori / 10;
                digit = digit * 10;
            }
            indexForSorting[i][1] = mappedNum;
        }

        System.out.println(Arrays.deepToString(indexForSorting));

        Arrays.sort(indexForSorting, (a, b) -> Integer.compare(a[1], b[1]));

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = indexForSorting[i][0];
        }
        return result;
    }


    /**
     *  Analysis : quick sort is unstable sorting.
     *
     */
    public int[] solutionIncorrect(int[] mapping, int[] nums) {
        int[] indexForSorting = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int ori = nums[i];
            int mappedNum = 0;
            int digit = 1;

            if (ori == 0) {
                mappedNum = mapping[ori];
            }
            while (ori > 0) {
                mappedNum = mappedNum + mapping[ori % 10] * digit;
                ori = ori / 10;
                digit = digit * 10;
            }
            indexForSorting[i] = mappedNum;
        }

        System.out.println(Arrays.toString(indexForSorting));

        quickSort(nums, 0, nums.length - 1, indexForSorting);

        return nums;
    }

    public void quickSort(int[] nums, int start, int end, int[] indexForSorting) {
        if (start >= end) {
            return;
        }
        int mid = partition(nums, start, end, indexForSorting);
        quickSort(nums, start, mid - 1, indexForSorting);
        quickSort(nums, mid + 1, end, indexForSorting);
    }

    public int partition(int[] nums, int start, int end, int[] indexForSorting) {
        int pivot = start;

        for (int i = start; i < end; i++) {
            if (indexForSorting[i] < indexForSorting[end]) {
                swap(nums, i, pivot);
                swap(indexForSorting, i, pivot);
                pivot++;
            }
        }
        swap(nums, pivot, end);
        swap(indexForSorting, pivot, end);
        return pivot;
    }

    private void swap(int[] nums, int a, int b) {
        if (a == b) return;

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
