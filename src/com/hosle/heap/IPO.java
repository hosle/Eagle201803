package com.hosle.heap;




import java.util.*;

/**
 * https://leetcode.com/problems/ipo/description/
 * <p>
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital,
 * LeetCode would like to work on some projects to increase its capital before the IPO.
 * Since it has limited resources, it can only finish at most k distinct projects before the IPO.
 * Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.
 * <p>
 * You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
 * <p>
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
 * <p>
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
 * <p>
 * The answer is guaranteed to fit in a 32-bit signed integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
 * Output: 4
 * Explanation: Since your initial capital is 0, you can only start the project indexed 0.
 * After finishing it you will obtain profit 1 and your capital becomes 1.
 * With capital 1, you can either start the project indexed 1 or the project indexed 2.
 * Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
 * Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
 * Example 2:
 * <p>
 * Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
 * Output: 6
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= 105
 * 0 <= w <= 109
 * n == profits.length
 * n == capital.length
 * 1 <= n <= 105
 * 0 <= profits[i] <= 104
 * 0 <= capital[i] <= 109
 */
public class IPO {
    public int solution(int k, int w, int[] profits, int[] capital) {
        ArrayList<Map.Entry<Integer, Integer>> capitalProfitList = new ArrayList<>();

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        for (int i = 0; i < profits.length; i++) {
            Map.Entry<Integer, Integer> newPair = new AbstractMap.SimpleEntry<>(capital[i], profits[i]);
            capitalProfitList.add(newPair);
        }

        Collections.sort(capitalProfitList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getKey() - b.getKey();
            }
        });

        int j = 0;
        int listSize = capitalProfitList.size();
        for (int i = 0; i < k; i++) {
            while (j < listSize && capitalProfitList.get(j).getKey() <= w) {
                pq.add(capitalProfitList.get(j++));
            }
            if (pq.isEmpty()) {
                break;
            }
            w += pq.poll().getValue();
        }
        return w;
    }
}
