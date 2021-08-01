import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var (N,M,V) = readLine()!!.split(" ").map { it.toInt() } // 4 5 1
    var adjacent = Array<IntArray>(N+1) { IntArray(N+1) }
    var check = BooleanArray(N+1)
    repeat(M) {
        var (a,b) = readLine()!!.split(" ").map {it.toInt()}
        adjacent[a][b] = 1
        adjacent[b][a] = 1
    }
    dfs(N, M, V, adjacent, check)
   check.fill(false)
    println()
    bfs(N, M, V, adjacent, check)
}

fun dfs(N:Int, M:Int, V:Int, adjacent: Array<IntArray>, check: BooleanArray) {
    check[V] = true
    print("$V ")
    for(i in 1..N) {
        if(adjacent[V][i] == 1 && !check[i]) {
            dfs(N,M,i,adjacent,check)
        }
    }
}

fun bfs(N:Int, M:Int, V:Int, adjacent: Array<IntArray>, check: BooleanArray) {
var queue: Queue<Int> = LinkedList<Int>()
    queue.add(V)
    check[V] = true
    while (queue.isNotEmpty()) {
        var point = queue.poll()
        print("$point ")
        for(i in 1..N) {
            if(!check[i] && adjacent[point][i] == 1) {
                queue.add(i)
                check[i] = true
            }
        }
    }
}