import java.util.*

fun main() {
solution(arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"))
}
fun solution(operations: Array<String>): ArrayList<Int> {
    var answer = ArrayList<Int>()
    var maxPriorQueue = PriorityQueue<Int>() // 오름차순
    var minPriorQueue = PriorityQueue<Int>(Collections.reverseOrder()) // 내림차순
    var min: Int = 0
    var max: Int = 0
    operations.forEach {
        when {
            it[0] == 'I' -> {
                maxPriorQueue.add(it.split(" ")[1].toInt())
                minPriorQueue.add(it.split(" ")[1].toInt())
            }
            it == "D 1" -> {
                if(!minPriorQueue.isEmpty()) {
                    max = minPriorQueue.poll()
                    maxPriorQueue.remove(max)
                }
            }
            it == "D -1" -> {
                if(!maxPriorQueue.isEmpty()) {
                    min = maxPriorQueue.poll()
                    minPriorQueue.remove(min)
                }

            }
        }
    }
    if(!minPriorQueue.isEmpty() && !maxPriorQueue.isEmpty()) {
        answer.add(minPriorQueue.poll())
        answer.add(maxPriorQueue.poll())
    }
    else {
        answer.add(0)
        answer.add(0)
    }

    return answer
}