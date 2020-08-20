
package com.cssolutions.sort

fun mergeSort (array: IntArray) = mergeSort(array, 0, array.size -1)

private fun mergeSort( array: IntArray, low: Int, high: Int) {
    if(low< high) {
        val mid = low + (high - low)/2
        mergeSort(array, low, mid)
        mergeSort(array, mid+1, high)
        mergeSort(array, low, mid, high)
    }

}

fun mergeSort(array: IntArray, low: Int, mid: Int, high: Int) {

    val subArray1Size = mid - low + 1
    val subArray2Size = high - (mid + 1 ) + 1

    val subArray1 = Array(subArray1Size){0}
    val subArray2 = Array(subArray2Size){0}

    for (i in subArray1.indices){
        subArray1[i] = array[low + i]
    }

    for (i in subArray2.indices){
        subArray2[i] = array[mid + 1 + i]
    }

    var subArray1Counter = 0
    var subArray2Counter = 0
    var lowIndex = low

    while(subArray1Counter < subArray1.size && subArray2Counter < subArray2.size) {
        if(subArray1[subArray1Counter] < subArray2[subArray2Counter]) {
            array[lowIndex] = subArray1[subArray1Counter]
            subArray1Counter++
        } else {
            array[lowIndex] = subArray2[subArray2Counter]
            subArray2Counter++
        }
        lowIndex++
    }

    while (subArray1Counter < subArray1.size) {
        array[lowIndex] = subArray1[subArray1Counter]
        subArray1Counter ++
        lowIndex++
    }
    while (subArray2Counter < subArray2.size) {
        array[lowIndex] = subArray2[subArray2Counter]
        subArray2Counter ++
        lowIndex++
    }
}
