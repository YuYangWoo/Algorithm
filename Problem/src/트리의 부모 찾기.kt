import java.util.*
import kotlin.collections.ArrayList

fun main()  = with(System.`in`.bufferedReader()){
    var N = readLine()!!.toInt()
    var adjacent = Array(N+1){ arrayListOf<Int>()}
    var visit = BooleanArray(N+1) {false}
    var rootList = Array(N+1) {0}
    var queue: Queue<Int> = LinkedList<Int>()
    for(i in 0 until N-1) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        adjacent[input[0]].add(input[1])
        adjacent[input[1]].add(input[0])
    }
    for(i in adjacent.indices) {
        adjacent[i].sort()
    }
    bfs(adjacent, visit, rootList,queue)
    for(i in 2 until rootList.size) {
        println(rootList[i])
    }
}
fun bfs(adjacent:Array<ArrayList<Int>>, visit: BooleanArray, rootList: Array<Int>, queue:Queue<Int>) {
    visit[1] = true
    queue.add(1)
    while (queue.isNotEmpty()) {
        var node = queue.poll()
        for(i in adjacent[node]) {
            if(!visit[i]) {
                queue.add(i)
                visit[i] = true
                rootList[i] = node
            }
        }
    }
}