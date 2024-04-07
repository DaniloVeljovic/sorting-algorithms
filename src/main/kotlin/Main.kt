package de.dveljovic

import de.dveljovic.bubble.bubbleSort

fun main() {
    val unsortedArray = arrayOf(5, 1, 4, 2, 8)
    unsortedArray.bubbleSort()
    unsortedArray.forEach { println(it) }
}