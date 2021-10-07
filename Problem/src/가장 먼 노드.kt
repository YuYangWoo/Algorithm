import java.util.*
import kotlin.collections.ArrayList

fun main() {
    print(
        solution(
            6,
            arrayOf(
                intArrayOf(3, 6),
                intArrayOf(4, 3),
                intArrayOf(3, 2),
                intArrayOf(1, 3),
                intArrayOf(1, 2),
                intArrayOf(2, 4),
                intArrayOf(5, 2)
            )
        )
    )
}

fun solution(n: Int, edge: Array<IntArray>): Int {

    var visit = BooleanArray(n + 1) { false }
    var depthArray = IntArray(n + 1) { 0 }
    var adjacent = Array(n + 1) { arrayListOf<Int>() }
    for (i in edge.indices) {
        adjacent[edge[i][0]].add(edge[i][1])
        adjacent[edge[i][1]].add(edge[i][0])
    }

    for(i in 1 until n) {
        adjacent[i].sort()
    }
    return bfs(visit, adjacent, depthArray)
}

fun bfs(visit: BooleanArray, adjacent: Array<ArrayList<Int>>, depthArray: IntArray): Int {
    var queue: Queue<Int> = LinkedList<Int>()
    queue.add(1)
    visit[1] = true

    while (queue.isNotEmpty()) {
        var point = queue.poll()
        for (i in 1 .. adjacent[point].size) {
            var x = adjacent[point][i-1]
            if (!visit[x]) {
                queue.add(x)
                visit[x] = true
                depthArray[x] = depthArray[point] + 1
            }
        }
    }
    val depthMax = depthArray.maxOrNull() ?:0
    return depthArray.count { it == depthMax }
}