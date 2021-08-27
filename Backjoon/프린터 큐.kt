import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    var queue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
    var T = readLine()!!.toInt()
    var cnt = 0
    for (i in 0 until T) {
        var (N, M) = readLine()!!.split(" ").map { it.toInt() }
        var priorList = readLine()!!.split(" ").map { it.toInt() }
        for (i in priorList.indices) {
            if (i == M) {
                queue.add(Pair(priorList[i], 1))
            } else {
                queue.add(Pair(priorList[i], 0))
            }
        }
        var point = queue.elementAt(M)

        while (true) {
            if (queue.peek() == queue.maxByOrNull { it.first }) {
                var answer = queue.poll()
                cnt++
                if (answer.first == point.first && answer.second == point.second) {
                    break
                }
            } else {
                queue.add(queue.poll())
            }
        }

        println(cnt)
        cnt = 0
        queue.clear()
    }
}