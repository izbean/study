package c10_bit_wise

import kotlin.experimental.and

fun main() {
    var x: Byte = 0b1010
    var y: Byte = 0b1100

    println(x)
    println(y)

    var z: Byte = x and y

    println(z)

}