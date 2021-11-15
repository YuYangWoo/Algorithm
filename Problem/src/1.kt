import java.lang.Math.max

fun main() {
    solutionzaqw(intArrayOf(5,3,10,6,11))
}
fun solutionzaqw(A: IntArray): Int {
    var odd = 0
    var even = 0
    for (value in A) {
        if (value % 2 == 1) {
            odd = max(odd, value)
        } else {
            even = max(even, value)
        }
    }

    return odd + even
}