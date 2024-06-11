package com.hosle.unionfind

fun main(){
    val board = arrayOf(
        charArrayOf('X','X','X','X'),
        charArrayOf('X','O','O','X'),
        charArrayOf('X','X','O','X'),
        charArrayOf('X','O','X','X'),
    )

    val board2 = arrayOf(
        charArrayOf('X')
    )

    val board3 = arrayOf(
        charArrayOf('X','X','X'),
        charArrayOf('X','O','X'),
        charArrayOf('X','X','X')
    )


    val board4 = arrayOf(
        charArrayOf('O','X','X','O','X'),
        charArrayOf('X','O','O','X','O'),
        charArrayOf('X','O','X','O','X'),
        charArrayOf('O','X','O','O','O'),
        charArrayOf('X','X','O','X','O'),
    )

    val board5 = arrayOf(
        charArrayOf('X','O','X'),
        charArrayOf('X','O','X'),
        charArrayOf('X','O','X')
    )

    val board6 = arrayOf(
        charArrayOf('X','O','X','O','X','O'),
        charArrayOf('O','X','O','X','O','X'),
        charArrayOf('X','O','X','O','X','O'),
        charArrayOf('O','X','O','X','O','X'),
    )

    val board7 = arrayOf(
        charArrayOf('X','O','O','X','X','X','O','X','O','O'),
        charArrayOf('X','O','X','X','X','X','X','X','X','X'),
        charArrayOf('X','X','X','X','O','X','X','X','X','X'),
        charArrayOf('X','O','X','X','X','O','X','X','X','O'),
        charArrayOf('O','X','X','X','O','X','O','X','O','X'),
        charArrayOf('X','X','O','X','X','O','O','X','X','X'),
        charArrayOf('O','X','X','O','O','X','O','X','X','O'),
        charArrayOf('X','O','O','X','X','O','X','X','O','O'),
        charArrayOf('X','X','X','O','O','X','O','X','X','O')
    )

    val board8 = arrayOf(
        charArrayOf('X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'),
     charArrayOf('X','X','X','X','X','X','X','X','X','O','O','O','X','X','X','X','X','X','X','X'),
     charArrayOf('X','X','X','X','X','O','O','O','X','O','X','O','X','X','X','X','X','X','X','X'),
     charArrayOf('X','X','X','X','X','O','X','O','X','O','X','O','O','O','X','X','X','X','X','X'),
     charArrayOf('X','X','X','X','X','O','X','O','O','O','X','X','X','X','X','X','X','X','X','X'),
     charArrayOf('X','X','X','X','X','O','X','X','X','X','X','X','X','X','X','X','X','X','X','X')
    )

    val boardx = board8
    solve(boardx)
    boardx.forEach { it ->
        println(it.contentToString())
    }
}

fun solve(board:Array<CharArray>){
    for (i in board.indices) {
        println(board[i].contentToString())
    }
    println()

    // edge case
    if (board.size<=2){
        return
    }

    //init
    val parent = Array<Array<Int>>(board.size){i -> Array<Int>(board[0].size){j -> i*board[0].size+j} }

    for (i in parent.indices) {
        println(parent[i].contentToString())
    }
    println()

    val validRoots = hashSetOf<Int>()
    //init & union
    for (i in 0.. board.size-1){
        for (j in 0 .. board[i].size-1){
            if (board[i][j] == 'X')
                continue

            validRoots.add(find(parent,i,j))

            if (i-1>=0 && board[i-1][j] =='O'){
                union(parent, i,j,i-1, j, validRoots)
            }

            if (j-1>=0 && board[i][j-1] == 'O'){
                union(parent, i,j,i, j-1, validRoots)
            }
        }
    }

    for (i in parent.indices) {
        println(parent[i].contentToString())
    }

    for (i in parent.indices) {
        for (j in parent[i].indices) {
            if (i <= 0 || j <= 0 || i == parent.size - 1 || j == parent[0].size - 1) {
                validRoots.remove(find(parent, i, j))
            }
        }
    }
    println("valid Roots : ${validRoots.toArray().contentToString()}")

    //find
    for (i in parent.indices){
        for (j in parent[i].indices){
            if (i <= 0 || j <= 0 || i== parent.size-1 || j == parent[0].size-1){
                continue
            }
            if (board[i][j] == 'X')
                continue

            val root = find(parent, i, j)
            if (validRoots.contains(root)){
                board[i][j] = 'X'
            }
        }
    }
}

fun union(parent:Array<Array<Int>>, x1:Int, y1:Int, x2:Int, y2:Int, validRoots:HashSet<Int>){
    val xSet = find(parent, x1, y1)
    val ySet = find(parent, x2, y2)
    parent[xSet/parent[0].size][xSet%parent[0].size] = ySet

    validRoots.add(ySet)
}

fun find(parent:Array<Array<Int>>, targetX:Int, targetY:Int):Int{
    if (targetX*parent[0].size+targetY == parent[targetX][targetY]){
        return parent[targetX][targetY]
    }
    return find(parent, parent[targetX][targetY]/parent[0].size, parent[targetX][targetY]%parent[0].size)
}