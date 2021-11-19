import java.util.*
import kotlin.collections.ArrayList
var DX = intArrayOf(1,0,-1,0)
var DY = intArrayOf(0,1,0,-1)
fun main() {
    while(true) {
        var (w,h) = readLine()!!.split(" ").map { it.toInt() }
        var adjacent = Array(h){arrayListOf<Int>()}
        var check = Array(h) {Array(w) {false} }
        for(i in 0 until h) {
            var input = readLine()!!.split(" ").map { it.toInt() }
            for(j in input.indices) {
                adjacent[i].add(input[j])
            }
        }
        var answer = bFs(check,adjacent,w,h)
        println(answer)
    }
}
fun bFs(check:Array<Array<Boolean>>, adjacent:Array<ArrayList<Int>>, w: Int, h: Int): Int {
    var count = 0
    var queue: Queue<Pair<Int,Int>> = LinkedList()
    queue.add(Pair(0,0))
    check[0][0] = true
    while(queue.isNotEmpty()) {
        var node = queue.poll()
        for(i in 0..3) {
            var ix = node.first+DX[i]
            var iy = node.second+DY[i]
            if(ix>=0 && iy>=0 && ix<w && iy<w) {
                if(!check[ix][iy] && adjacent[ix][iy] == 1) {
                    queue.add(Pair(ix,iy))
                    check[ix][iy] = true
                    count++
                }
            }
        }
    }
    return count
}