import java.util.*

fun main() {
    val (n,m) = readLine()!!.split(" ").map { it.toLong() }
    val input = readLine()!!.split(" ").map { it.toLong() }
    var pq = PriorityQueue<Long>()
    for (i in input.indices) {
        pq.add(input[i])
    }

    for(i in 0 until m) {
        var x = pq.poll()
        var y = pq.poll()
        var sum = x+y
        pq.add(sum)
        pq.add(sum)
    }
    print(pq.sum())
}