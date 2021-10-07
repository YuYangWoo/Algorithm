
import java.util.*

fun main() {
    val (K, N) = readLine()!!.split(" ")
    var array = readLine()!!.split(" ").map { it.toLong() }
    var priorityQueue = PriorityQueue<Long>()
    for(i in 0 until K.toLong()) {
        priorityQueue.add(array[i.toInt()])
    }
    var standard: Long = 0
    for(i in 0 until N.toLong()) {
        standard = priorityQueue.poll()
        for(j in 0 until K.toLong()) {
            var value: Long = standard * array[j.toInt()]
            priorityQueue.add(value)
          if(standard % array[j.toInt()] == 0L) {
              break
          }
        }
    }
    print(standard)
}