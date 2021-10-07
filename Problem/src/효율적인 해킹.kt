import java.util.*
import kotlin.collections.ArrayList

fun main() = with(System.`in`.bufferedReader()){
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var adjacent = Array(N+1) {arrayListOf<Int>()}
    for(i in 0 until M) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        adjacent[input[0]].add(input[1])
    }
    for(i in adjacent.indices) {
        adjacent[i].sort()
    }
    var countingArray = Array(N+1) {0}
    for(i in 1 .. N) {
        bfs(countingArray,adjacent, i)
    }

    var result = ArrayList<Int>()
    for(i in countingArray.indices) {
        if(countingArray[i] == countingArray.maxOrNull()) {
            result.add(i)
        }
    }
    result.sorted().forEach { print("$it ") }
}
fun bfs(countingArray:Array<Int>, adjacent:Array<ArrayList<Int>>, start:Int) {
    var queue:Queue<Int> = LinkedList<Int>()
    var visit = Array(adjacent.size+1) {false}
    visit[start] = true
    queue.add(start)
    while(queue.isNotEmpty()) {
        var node = queue.poll()
        for(i in adjacent[node]) {
            if(!visit[i]) {
                visit[i] = true
                countingArray[i]++
                queue.add(i)
            }
        }
    }
}