import java.util.*
import kotlin.collections.ArrayList

var dX = intArrayOf(1, 0, -1, 0)
var dY = intArrayOf(0, 1, 0, -1)
var horseX = intArrayOf(-2, -2, -1, 1, 2, 2, 1, -1)
var horseY = intArrayOf(1, -1, 2, 2, 1, -1, -2, -2)
lateinit var checkArrrrr: Array<Array<Array<Int>>>

fun main() {
    val K = readLine()!!.toInt()
    var (W, H) = readLine()!!.split(" ").map { it.toInt() }
    checkArrrrr = Array(H) { Array(W) { Array(31) { 0 } } }

    var arr = Array(H) { arrayListOf<Int>() }
    for (i in 0 until H) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        for (j in input.indices) {
            arr[i].add(input[j])
        }
    }

    bfs(K, W, H, arr)
}


fun bfs(K: Int, W: Int, H: Int, arr: Array<ArrayList<Int>>) {
    var queue: Queue<Triple<Int, Int, Int>> = LinkedList()
    queue.add(Triple(0, 0, 0))
    checkArrrrr[0][0][0] = 0
    while (queue.isNotEmpty()) {
        val node: Triple<Int, Int, Int> = Triple(queue.peek().first, queue.peek().second, queue.peek().third)
        queue.poll()
        if (node.first == H-1  && node.second == W - 1) {
            print(checkArrrrr[node.first][node.second][node.third])
            return
        }

        for (i in 0..3) { //1,0 0,1 -1,0 0,-1 queue 0 0
            var ix = node.first + dX[i]
            var iy = node.second + dY[i]
            if (ix >= 0 && iy >= 0 && ix < H && iy < W) {
                if (arr[ix][iy] == 0 && checkArrrrr[ix][iy][node.third] == 0) {
                    checkArrrrr[ix][iy][node.third] = checkArrrrr[node.first][node.second][node.third]+1
                    queue.add(Triple(ix, iy, node.third))
                }
            }
        }

        if (node.third < K) {
            for (i in 0..7) {
                var ix = node.first + horseX[i]
                var iy = node.second + horseY[i]
                if (ix >= 0 && iy >= 0 && ix < H && iy < W) {
                    if (arr[ix][iy] == 0 && checkArrrrr[ix][iy][node.third + 1] == 0) {
                        checkArrrrr[ix][iy][node.third+1] = checkArrrrr[node.first][node.second][node.third]+1
                        queue.add(Triple(ix, iy, node.third + 1))
                    }
                }
            }
        }

    }
    print("-1")
}