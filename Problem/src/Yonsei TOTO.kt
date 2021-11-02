import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var m = sc.nextInt()
    var sum = 0
    var cnt = 0
    var valueQueue = PriorityQueue<Int>()
    for (i in 0 until n) {
        var pq = PriorityQueue<Int>(reverseOrder())

        var p = sc.nextInt()
        var l = sc.nextInt()

        val input = ArrayList<Int>()
        for (z in 0 until p) {
            input.add(sc.nextInt())

        }
        for (j in input.indices) {
            pq.add(input[j])
        }
        if (p >= l) {
            for (j in 0 until l - 1) {
                pq.poll()
            }
            valueQueue.add(pq.poll())

        } else {
            valueQueue.add(1)
        }
    }
    for (i in valueQueue.indices) {
        if ((sum + valueQueue.peek()) <= m) {
            sum += valueQueue.poll()
            cnt++
        }
    }
    print(cnt)
}