package com.hosle.unionfind

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 *
 *Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
fun main(){
    val inputArr = arrayOf(
        arrayOf(1,1,1,1,0),
        arrayOf(1,1,0,1,0),
        arrayOf(1,1,0,0,0),
        arrayOf(0,0,0,0,0)
    )

    val inputArr2 = arrayOf(
        arrayOf(1,1,0,0,0),
        arrayOf(1,1,0,0,0),
        arrayOf(0,0,1,0,0),
        arrayOf(0,0,0,1,1)
    )

    solution(inputArr2)

}

private fun solution(inputArr:Array<Array<Int>>){
    // init
    val parent = Array<IntArray>(4){i -> IntArray(5){j -> i*10 +j} }

    for (i in parent.indices){
        println(parent[i].contentToString())
    }

    //union
    for (i in inputArr.indices){
        for (j in inputArr[i].indices){

            val cell = inputArr[i][j]
            if(j>0) {
                if (inputArr[i][j - 1] + cell == 2) {
                    union(parent, i, j, i, j-1)
                }
            }
            if (i>0) {
                if (inputArr[i - 1][j] + cell == 2){
                    union(parent,i,j, i-1, j)
                }
            }
        }
    }

    for (i in parent.indices){
        println(parent[i].contentToString())
    }

    // rootId -> deep
    val island = HashSet<Int>()
    for (i in inputArr.indices){
        for (j in inputArr[i].indices){
            val rootIndex = find(parent, i, j)
            val rootIndexX = rootIndex/10
            val rootIndexY = rootIndex%10
            if (inputArr[rootIndexX][rootIndexY] == 1){
                island.add(rootIndex)
            }
        }
    }

    println(island.toArray().contentToString())

    println("Island amount = ${island.size}")
}

private fun union(data: Array<IntArray>, cell1x: Int, cell1y:Int, cell2x:Int, cell2y:Int){
    data[cell1x][cell1y] = find(data, cell2x, cell2y)
}

private fun find(data : Array<IntArray>, x:Int, y:Int):Int{
    if (data[x][y] == x*10+y)
        return x*10+y
    val dataX = data[x][y]/10
    val dataY = data[x][y]%10
    return find(data, dataX, dataY)
}

