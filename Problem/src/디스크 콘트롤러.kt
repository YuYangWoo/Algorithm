import java.io.Serializable
import java.util.*

fun main() {
solutionc(arrayOf(intArrayOf(0,3),intArrayOf(1,9),intArrayOf(2,6)))
}
fun solutionc(jobs: Array<IntArray>): Int {
    var answer = 0
    var time = 0
    var waitQueue = PriorityQueue<Job>(compareBy { it.start }) //앞에 ms를 오름차순으로 정렬을하고
    for(i in jobs.indices) {
        var job = Job(jobs[i][0], jobs[i][1])
        waitQueue.add(job)
    }

    println(waitQueue)
    while(!waitQueue.isEmpty()) {
        // 0 1 2 0 3
        var readyQueue = PriorityQueue<Job>(compareBy{it.during}) // 뒤에꺼를 기준으로하잖아요 앞에꺼 기준으로 오름차순 된거 + 뒤에
        while(!waitQueue.isEmpty() && time >= waitQueue.peek().start) {
            readyQueue.add(waitQueue.poll())
            println(readyQueue)
        }
        if(readyQueue.isEmpty()) {
            time++
            continue
        }
        time += readyQueue.peek().during
        answer += time - readyQueue.peek().start
        readyQueue.poll()

        for(i in readyQueue.indices) {
            waitQueue.add(readyQueue.poll())
        }
    }

    answer /= jobs.size
    println(answer)
    return answer
}
data class Job(var start: Int, var during: Int) {
    constructor(): this(0,0)
}