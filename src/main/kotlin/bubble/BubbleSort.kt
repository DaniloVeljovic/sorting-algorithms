package de.dveljovic.bubble

fun Array<Int>.bubbleSort() {
    val n = this.size
    for (i in (1..n)) {
        for (j in (1 .. (n - i))) {
            if (this[j - 1] > this[j]) {
                val temp = this[j - 1]
                this[j - 1] = this[j]
                this[j] = temp
            }
        }
    }
}