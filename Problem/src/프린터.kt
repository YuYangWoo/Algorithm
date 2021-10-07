import java.util.*

fun main() {
    print(solutionz(intArrayOf(2,1,3,2),3))
}
fun solutionz(priorities: IntArray, location: Int): Int {
    var answer = 1
    // 큐에다가 priorities의 값을 넣어준다.
   var queue = PriorityQueue<Int>(Collections.reverseOrder())

    priorities.forEach {
        queue.offer(it)
    }
    while(!queue.isEmpty()) {
        for(i in priorities.indices) {
            if(priorities[i] == queue.peek()) { // 3, 2, 2, 1
                if(location == i) {
                    return answer
                }
                else {
                    answer++
                    queue.poll()
                }
            }
        }
    }
    return answer
}