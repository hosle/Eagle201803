package com.hosle.unionfind

import kotlin.math.max

/**
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 **/
fun main(){
    val nums = arrayOf(100, 4, 200, 1, 3, 2)
    val parent = HashMap<Int, Int?>()

    // init
    for (item in nums){
        parent[item] = item
    }
    println("parent :")
    parent.forEach{(key,value)-> println("$key : $value") }

    // union
    for (item in nums) {
        parent[item-1] = find(parent, item)
    }

    println("parent :")
    parent.forEach{(key,value)-> println("$key : $value") }

    // find
    var len = 0

    for (item in nums){
        val rootId = find(parent, parent[item])
        if (rootId!=null){
            len = max(len, rootId - item + 1)
        }
    }

    println("longest size = ${len}")
}

private fun find(data:HashMap<Int,Int?>, x:Int?): Int?{
    if (x == data[x])
        return x
    return find(data, data[x])
}
