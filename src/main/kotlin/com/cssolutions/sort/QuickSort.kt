package com.cssolutions.sort

fun quickSort(array: IntArray) = quickSort(array, 0, array.size - 1)

private fun quickSort(array: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivot = partition(array, low, high)
        quickSort(array, low, pivot - 1)
        quickSort(array, pivot + 1, high)
    }
}

private fun partition(array: IntArray, low: Int, high: Int): Int {

    var i = low - 1
    val pivot = array[high]
    for (j in low until high) {
        if (array[j] < pivot) {
            i++
            swap(array, i, j)
        }
    }
    swap(array, i + 1, high)
    return i + 1
}

private fun swap(array: IntArray, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}
