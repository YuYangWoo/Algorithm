import kotlin.math.max

var time = 0
var sum = 0
var maximum = 0
fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine()!!.toInt()
    val arr = Array(N) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }

    for (i in 0 until N) {
        recursion(arr, i, N)
    }
    print(maximum)
}

fun recursion(arr: Array<IntArray>, day: Int, N: Int) {
    when {
        day + arr[day][0] == N -> {
            sum += arr[day][1]
            maximum = max(maximum, sum)
            sum = 0
        }
        day + arr[day][0] > N -> {
            maximum = max(maximum, sum)
            sum = 0
        }
        else -> {
            sum += arr[day][1]
            var tmp = sum
            for (i in arr[day][0] + day until N) {
                sum = tmp
                recursion(arr, i, N)
            }
        }
    }
}