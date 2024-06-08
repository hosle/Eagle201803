package com.hosle.unionfind

val parent= arrayOf(0,1,2,3,4,5,6,7,8,9)

fun main(){
    println(parent.contentToString())

    union(1,2)
    println(parent.contentToString())
    union(2,3)
    println(parent.contentToString())
    println("find(2) : ${find(2)}, find(4) : ${find(4)}")

    union(2,4)
    println("find(2) : ${find(2)}, find(4) : ${find(4)}")
    println(parent.contentToString())
}

// 1-2-3-4, 5, 6, 7, 8, 9

fun find(x: Int): Int{
    if (parent[x] == x) return x

    return find(parent[x])
}
fun union(x:Int, y:Int){
    val xSet = find(x)
    val ySet = find(y)
    if(xSet != ySet){
        parent[xSet] = ySet
    }
}