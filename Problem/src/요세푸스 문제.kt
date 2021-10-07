import java.util.*

fun main() {
    var (N,K) = readLine()!!.split(" ").map { it.toInt() }
    var queue: Queue<Int> = LinkedList<Int>()
    var answerList = ArrayList<Int>()
    for(i in 1..N) {
        queue.add(i)
    }
    while(queue.isNotEmpty()) {
        for(i in 1..K) {
            if(i%K == 0) {
                answerList.add(queue.poll())
            }
            else {
                var a = queue.poll()
                queue.add(a)
            }

        }
    }
    print("<")
    for(i in answerList.indices) {
        if(i == N-1) {
            print("${answerList[i]}")
            print(">")
        }
        else {
            print("${answerList[i]}, ")
        }
    }
}