import java.util.*
import kotlin.math.abs

fun main() {
    var N = readLine()!!.toInt()
    var number = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var deque = ArrayDeque<Pair<Int, Int>>()
    var answerArray = ArrayList<Int>()
    for (i in number.indices) {
        deque.add(Pair(number[i],i+1))
    } // 데큐 첫번째는 숫자 뒤에는 순서
    // 데큐 first는 위 last는 밑
    var point = deque.poll()
    answerArray.add(point.second)

    while (deque.isNotEmpty()) {
        if (point.first > 0) {
            for (i in 1 until abs(point.first)) {
                deque.addLast(
                    deque.pollFirst()
                )
            }
            point = deque.pollFirst()
            answerArray.add(point.second)

        } else {
            for (i in 1 until abs(point.first)) {
                deque.addFirst(deque.pollLast())
            }
            point = deque.pollLast()
            answerArray.add(point.second)
        }
    }

  for(i in answerArray.indices) {
      print("${answerArray[i]} ")
  }

}