package com.hosle.basic

import java.util.*


data class Custom(val data: Int, val index: Int)

fun main() {

    arraySort()

    listSort()

    backwardTraverse()

    listToArray()

    arrayToList()

    traverseCharInString()

    stringToArrayOrList()

    getSubArray()

    getSubList()

    printArrayOrList()

}

fun arraySort() {
    println("\n==== Array sort")

    val array1 = intArrayOf(
        67, 3, 10, 2, 8, 4, 3
    )

    println("Array1 : ${array1.joinToString()}")

    val sortedArray1 = array1.sortedArray()

    println("array1.sortedArray : ${sortedArray1.javaClass.simpleName} : ${sortedArray1.joinToString()}")

    val sortedArray2 = array1.sortedArrayDescending()

    println("array2.sortedArrayDescending : ${sortedArray2.javaClass.simpleName} : ${sortedArray2.joinToString()}")

    val sortedArrayList = array1.sorted()

    println("array1.sorted : ${sortedArrayList.javaClass.simpleName} : ${sortedArray1.joinToString()}")


    println("Array1 : ${array1.joinToString()}")

    array1.sort()

    println("array1.sort : ${array1.joinToString()}")


    val complexDataArray = arrayOf(
        Custom(12, 0),
        Custom(1, 1),
        Custom(8, 2)
    )

    with(complexDataArray.copyOf()) {
        Arrays.sort(this) { o1, o2 -> o1.data - o2.data }

        println("Arrays.sort(complexDataArray) { o1, o2 -> o1.data - o2.data } : ${this.joinToString()}")
    }
}

fun listSort() {
    println("\n==== List sort")

    val numbers = listOf(67, 3, 10, 2, 8, 4, 3)

    val sortedList = numbers.sorted()

    println("numbers.sorted : ${sortedList.javaClass.simpleName} : ${sortedList.joinToString()}")

    val sortedList2 = numbers.sortedWith { a, b ->
        a - b
    }

    println(
        "numbers.numbers.sortedWith{a,b ->\n" +
                "        a - b\n" +
                "    } : \n ${sortedList2.javaClass.simpleName} : ${sortedList2.joinToString()}"
    )

    println("There's no such sortedWithDescending{}!!!")

    val sortedList3 = numbers.sortedBy { it }

    println("numbers.sortedBy{ it } : ${sortedList3.javaClass.simpleName} : ${sortedList3.joinToString()}")

    val sortedList4 = numbers.sortedByDescending { it }

    println("numbers.sortedByDescending{ it } : ${sortedList4.javaClass.simpleName} : ${sortedList4.joinToString()}")

    val complexDataList = listOf(
        Custom(12, 0),
        Custom(1, 1),
        Custom(8, 2)
    )

    with(complexDataList.toMutableList()) {
        Collections.sort(this) { o1, o2 -> o1.data - o2.data }

        println("Collections.sort(this) { o1, o2 -> o1.data - o2.data } : ${this.joinToString()}")
    }
}


fun backwardTraverse() {
    println("\n ====Backward Traverse")

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7)

    println("for (i in numberList.indices.reversed()) : ")
    for (i in numberList.indices.reversed()) {
        print("${numberList[i]},")
    }
    println()

    println("for (i in numberList.lastIndex downTo 0) : ")
    for (i in numberList.lastIndex downTo 0) {
        print("${numberList[i]},")
    }
    println()
}


fun listToArray() {
    println("\n==== List to Array")
    val listToIntList = listOf(
        1, 2, 3, 4, 5
    )

    val listToIntArrayArray = listToIntList.toIntArray()

    println("list.toIntArray() : ${listToIntArrayArray.joinToString()}")

    val listToArrayArray = listToIntList.toTypedArray()

    println("list.toTypedArray() : ${listToArrayArray.joinToString()}")
}

fun arrayToList() {
    println("\n==== Array to List")


    val arrayToListArray = intArrayOf(
        1, 2, 3, 4, 5, 6
    )

    val arrayToListArray2 = arrayOf(
        1, 2, 3, 4, 5, 6
    )

    val arrayToListList = arrayToListArray.asList()

    val arrayToListList2 = Arrays.asList(*arrayToListArray2)

    val arrayToListList3 = listOf(*arrayToListArray2)


    println("array.asList() : ${arrayToListList.joinToString()}")

    println("Arrays.asList(*arrayToListArray) : ${arrayToListList2.joinToString()}")

    println("listOf(*arrayToListArray2) : $arrayToListList3")
}



fun traverseCharInString() {
    println("\n==== Traverse char in string")


    val stringTraverseString = "abcdefg"

    for (c in stringTraverseString) {
        print("$c,")
    }
    println()

    stringTraverseString.forEachIndexed { i, c ->
        print("[$i] = $c, ")
    }
    println()

    for (i in stringTraverseString.indices) {
        print("[$i] = ${stringTraverseString[i]}, ")
    }
    println()

    for (i in stringTraverseString.indices.reversed()) {
        print("[$i] = ${stringTraverseString[i]}, ")
    }
    println()
}


fun stringToArrayOrList(){
    println("\n==== String to Array or List")

    val stringTraverseString = "abcdefg"


    val charList = stringTraverseString.toList()

    println("stringTraverseString.toList() : type = ${charList.javaClass.simpleName}, size = ${charList.size} ${charList}")

    val charArray = stringTraverseString.toCharArray()

    println("stringTraverseString.toCharArray() : type = ${charArray.javaClass.simpleName}, size = ${charArray.size} ${charArray.contentToString()}")

}

fun getSubArray() {
    println("\n==== Get SubArray")

    val fullArray = arrayOf(
        "a", "b", "c"
    )
    val subArray = fullArray.sliceArray(0..1)

    val subArrayToList = fullArray.slice(0..1)

    println("fullArray.sliceArray : type = ${subArray.javaClass.simpleName}, ${subArray.contentToString()}")

    println("fullArray.slice : type = ${subArrayToList.javaClass.simpleName}, ${subArrayToList}")

    val subArrayRange = fullArray.copyOfRange(0, 2)

    println("fullArray.copyOfRange(): type = ${subArrayRange.javaClass.simpleName}, ${subArrayRange.contentToString()}")
}


fun getSubList() {
    println("\n==== Get SubList")

    val fullList = listOf(
        1, 2, 3, 4, 5, 6
    )

    println("full list : $fullList")

    val subList1 = fullList.subList(0, 3).toList()

    println("fullList.subList(0, 3) : type = ${subList1.javaClass.simpleName} $subList1")

    val subList2 = fullList.slice(0..3)

    println("fullList.slice(0..3) : type = ${subList2.javaClass.simpleName} $subList2")
}


fun printArrayOrList() {
    println("\n==== Print Array or List")

    println("==== Array")

    val stringArray = arrayOf(
        "a", "b", "c"
    )

    println("print Array : ${stringArray.contentToString()}")

    val array = IntArray(5) { 0 }

    val array2 = IntArray(5) { i -> i + 1 }

    println("Original array : ${array.joinToString()}")
    println("Original array2 : ${array2.joinToString()}")

    println("array.contentToString() : ${array.contentToString()}")

    println("just print IntArray : $array")

    println("==== List")


    println("print List : ${stringArray.toList()}")

    println("print List as String : ${stringArray.toList().joinToString()}")

}
