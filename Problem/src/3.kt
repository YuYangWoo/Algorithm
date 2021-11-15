import java.lang.Math.abs
import java.lang.Math.min

fun main() {
    solutionabc(intArrayOf(1,1,3,4,4,4))
}

fun solutionabc(A: IntArray): Int {
    val data = HashMap<Int, Int>()
    A.forEach {
        data[it] = (data[it] ?: 0) + 1
    }

    var answer = 0
    data.forEach { (value, count) ->
        answer += min(count, abs(value - count))
    }

    return answer
}