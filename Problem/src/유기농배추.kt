import java.util.*
var dX = intArrayOf(1, 0, -1, 0)
var dY = intArrayOf(0, 1, 0, -1)
lateinit var checkArrrr: Array<Array<Boolean>>

fun main() {
    val T = readLine()!!.toInt()
    for (i in 0 until T) {
        var (M, N, K) = readLine()!!.split(" ").map { it.toInt() }
        checkArrrr = Array(M) { Array(N) { false } }
        var arr = Array(M) { Array(N) { 0 } }
        for (i in 0 until K) { // 10 8
            val input = readLine()!!.split(" ").map { it.toInt() }
            arr[input[0]][input[1]] = 1
        }
        var cnt = 0
        for(i in arr.indices) {
            for(j in arr[0].indices) {
                if(arr[i][j] == 1 && !checkArrrr[i][j]) {
                    bfsaz(M,N,K,arr,i,j)
                    cnt++
                }
            }
        }
        println(cnt)
    }

}

fun bfsaz(M: Int, N: Int, K: Int, arr: Array<Array<Int>>,i:Int,j:Int) {
    var queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(i,j))
    checkArrrr[i][j] = true
    while (queue.isNotEmpty()) {
        val node: Pair<Int, Int> = Pair(queue.peek().first, queue.peek().second)
        queue.poll()
        for (i in 0..3) { //1,0 0,1 -1,0 0,-1 queue 0 0
            var ix = node.first + dX[i]
            var iy = node.second + dY[i]
            if (ix >= 0 && iy >= 0 && ix < M && iy < N) {
                if(arr[ix][iy] == 1 && !checkArrrr[ix][iy]) {
                    checkArrrr[ix][iy] = true
                    queue.add(Pair(ix,iy))
                }
            }
        }
    }
}