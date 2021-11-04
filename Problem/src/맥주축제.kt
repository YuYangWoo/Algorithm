import java.util.*
import kotlin.collections.HashMap

fun main() {
    val (N,M,K) = readLine()!!.split(" ").map { it.toInt() }
    // N일동안 N개의 맥주를 마시려고함
    var hm = HashMap<Int,Int>()
    var pq = PriorityQueue<Int>()
    var arr = ArrayList<Pair<Int,Int>>()
    for(i in 0 until K) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        arr.add(Pair(input[0],input[1]))
    }
    var sum = 0
    // 도수 레벨 작은거
    // 선호도, 도수
    arr.sortBy { it.second }
    for(i in arr.indices) {
        sum += arr[i].first
        pq.add(arr[i].first)
        if(pq.size > N) {
            sum -= pq.poll()
        }
        if(sum >=M && pq.size == N) {
            print(arr[i].second)
            return
        }
    }
    print(-1)
}