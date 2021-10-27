import java.util.*
import kotlin.collections.ArrayList

val dx = intArrayOf(1, 0, -1, 0)
val dy = intArrayOf(0, 1, 0, -1)
fun main() = with(System.`in`.bufferedReader()) {
    val (M, N) = readLine().split(" ").map { it.toInt() }
    val adjacent = Array(N) { arrayListOf<Int>() }
    var check = Array(N) { Array(M) { false } }
    var positionArray = ArrayList<position>()
    for (i in 0 until N) {
        val input = readLine().split(" ").map { it.toInt() }
        for (j in input.indices) {
            adjacent[i].add(input[j])
        }
    }
    for (i in adjacent.indices) {
        for (j in adjacent[0].indices) {
            if (adjacent[i][j] == 1) {
                positionArray.add(position(i, j))
            }
        }
    }
    var adCnt = 0
    var minusCnt = 0
    for (i in adjacent.indices) {
        for (j in adjacent[0].indices) {
            if(adjacent[i][j] == 1) adCnt++
            if(adjacent[i][j] == -1) minusCnt++
        }
    }
    if(adjacent.size * adjacent[0].size-minusCnt == adCnt) {
        print(0)
        return
    }
    bfss(adjacent, check, positionArray)
    for (i in adjacent.indices) {
        for (j in adjacent[0].indices) {
            if(adjacent[i][j] == 0) {
                print(-1)
                return
            }

        }
    }

   print(counttttt-1)

}

var counttttt = 0
var cntArray = ArrayList<Int>()
fun bfss(adjacent: Array<ArrayList<Int>>, check: Array<Array<Boolean>>, positionArray: ArrayList<position>) {
    var queue: Queue<position> = LinkedList()
    for (i in positionArray.indices) {
        queue.add(position(positionArray[i].i, positionArray[i].j))
        check[positionArray[i].i][positionArray[i].j] = true
    }
    cntArray.add(queue.size)
    while (queue.isNotEmpty()) {
        var queueCnt = queue.size
        var cnt = 0
        for(z in 0 until queueCnt) {
            val node = queue.poll()

            for (i in 0..3) { // 3 5  dx 1 dy 0
                when (i) {
                    0 -> {
                        if (node.i < adjacent.size && node.j + 1 < adjacent[0].size && node.i >= 0 && node.j + 1 >= 0) {
                            if (adjacent[node.i][node.j + 1] == 0) {
                                adjacent[node.i][node.j + 1] = 1
                                queue.add(position(node.i, node.j + 1))
                                cnt++
                            }
                        }
                    }
                    1 -> {
                        if (node.i - 1 < adjacent.size && node.j < adjacent[0].size && node.i - 1 >= 0 && node.j >= 0) {
                            if (adjacent[node.i - 1][node.j] == 0) {
                                adjacent[node.i - 1][node.j] = 1
                                queue.add(position(node.i - 1, node.j))
                                cnt++
                            }
                        }
                    }
                    2 -> {
                        if (node.i < adjacent.size && node.j - 1 < adjacent[0].size && node.i >= 0 && node.j - 1 >= 0) {
                            if (adjacent[node.i][node.j - 1] == 0) {
                                adjacent[node.i][node.j - 1] = 1
                                queue.add(position(node.i, node.j - 1))
                                cnt++
                            }
                        }
                    }
                    3 -> {
                        if (node.i + 1 < adjacent.size && node.j < adjacent[0].size && node.i + 1 >= 0 && node.j >= 0) {
                            if (adjacent[node.i + 1][node.j] == 0) {
                                adjacent[node.i + 1][node.j] = 1
                                queue.add(position(node.i + 1, node.j))
                                cnt++
                            }
                        }
                    }
                }
                // when 끝
            }
        }
        counttttt++
        // for문끝

    }

}

data class position(var i: Int = 0, var j: Int = 0)