//import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.W
//import sun.jvm.hotspot.code.CompressedStream.H
//import java.util.*
//import kotlin.collections.ArrayList
//
//var dX = intArrayOf(1, 0, -1, 0)
//var dY = intArrayOf(0, 1, 0, -1)
//var horseX = intArrayOf(-2,-2,-1,1,2,2,1,-1)
//var horseY = intArrayOf(1,-1,2,2,1,-1,-2,-2)
//
//fun main() {
//    val K = readLine()!!.toInt()
//    var (W,H) = readLine()!!.split(" ").map { it.toInt() }
//    var arr = Array(W) { arrayListOf<Int>()}
//    for(i in 0 until W) {
//        val input = readLine()!!.split(" ").map { it.toInt() }
//        for(j in input.indices) {
//            arr[i].add(input[j])
//        }
//    }
//    bfs(K,W,H,arr)
//}
//
//fun bfs(K: Int,W:Int, H:Int, arr:Array<ArrayList<Int>>) {
//    var queue: Queue<Pair<Int, Int>> = LinkedList()
//    queue.add(Pair(0,0))
//
//    while(queue.isNotEmpty()) {
//        val node: Pair<Int,Int> = Pair(queue.poll().first, queue.poll().second)
//
//        for(i in 0..3) { //1,0 0,1 -1,0 0,-1 queue 0 0
//            var ix = node.first + dX[i]
//            var iy = node.second + dY[i]
//            if(ix >= 0 && iy >= 0 && ix < W && iy < H) {
//
//            }
//        }
//    }
//}