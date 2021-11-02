import java.util.*

fun main() {
    val N = readLine()!!.toInt()
    var queue: PriorityQueue<Int> = PriorityQueue<Int>()
    var set = HashSet<Int>()
    var arr = readLine()!!.split(" ").map { it.toInt() }
    for(i in arr.indices) {
        set.add(arr[i])
    }
    set.forEach { queue.add(it) }

    var index = 1
    while(queue.isNotEmpty()) {
        val node = queue.poll()
        if(index != node) {
            break
        }
        index++
    }
    print(index)

}