import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main() {
    print(
        solutioncv(
            9,
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(4, 6),
                intArrayOf(4, 7),
                intArrayOf(7, 8),
                intArrayOf(7, 9)
            )
        )
    )
}

fun solutioncv(n: Int, wires: Array<IntArray>): Int {
    var answer: Int = -1
    var newWires = ArrayList<IntArray>()
    var cnt = 0
    var queue: Queue<Int> = LinkedList<Int>()
    var queue2: Queue<Int> = LinkedList<Int>()
    var cntArray1 = ArrayList<Int>()
    var cntArray2 = ArrayList<Int>()
    loop@ for (j in wires.indices) {
        var adjacent = Array(n+1) { arrayListOf<Int>() }

        for (i in wires.indices) {
            if (cnt != i) {
                newWires.add(wires[i])
            }
        }
        for (z in newWires.indices) {
            adjacent[newWires[z][0]].add(newWires[z][1])
            adjacent[newWires[z][1]].add(newWires[z][0])
        }

        for(n in adjacent.indices) {
            adjacent[n].sort()
        }
        var cnt1 = 1
        var cnt2 = 1
        var visit = BooleanArray(n+1){false}
        var visit2 = BooleanArray(n+1){false}
        bfs(adjacent, newWires, wires[cnt],queue,visit, cnt1, cntArray1)
        bfs2(adjacent, newWires, wires[cnt], queue2, visit2, cnt2, cntArray2)
        newWires.clear()
        cnt++
    }
    var arr = ArrayList<Int>()
    for(i in cntArray1.indices) {
        arr.add(abs(cntArray1[i] - cntArray2[i]))
    }
    answer = arr.minOrNull()!!
    return answer
}

private fun bfs(adjacent: Array<ArrayList<Int>>, newWires: ArrayList<IntArray>, disappear: IntArray, queue: Queue<Int>, visit:BooleanArray, cnt1:Int, array:ArrayList<Int>) {
    // 버려진 선들 2개를 start로 해서 bfs를 돌리자..
    var count = cnt1
    queue.add(disappear[0])
    visit[disappear[0]] = true
    while (queue.isNotEmpty()) {
        var node = queue.poll() // 1
        for(i in adjacent[node].indices) {
            var x = adjacent[node][i]
            if(!visit[x]) {
                queue.add(x)
                count++
                visit[x] = true
            }
        }
    }
    array.add(count)
}

private fun bfs2(adjacent: Array<ArrayList<Int>>, newWires: ArrayList<IntArray>, disappear: IntArray, queue2: Queue<Int>, visit2:BooleanArray, cnt2: Int, array: ArrayList<Int>) {
    // 버려진 선들 2개를 start로 해서 bfs를 돌리자..
    var count = cnt2
    queue2.add(disappear[1])
    visit2[disappear[1]] = true
    while(queue2.isNotEmpty()) {
        var node = queue2.poll()
        for(i in adjacent[node].indices) {
            var x = adjacent[node][i]
            if(!visit2[x]) {
                queue2.add(x)
                count++
                visit2[x] = true
            }
        }
    }
    array.add(count)
}