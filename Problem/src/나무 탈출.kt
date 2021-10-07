var summ = 0

fun main() = with(System.`in`.bufferedReader()) {
    var N = readLine()!!.toInt()
    var adjacent = Array(N + 1) { arrayListOf<Int>() }
    for (i in 0 until N - 1) { // 코틀린 인접리스트로
        var a = readLine()!!.split(" ").map { it.toInt() }
        adjacent[a[0]].add(a[1])
        adjacent[a[1]].add(a[0])
    }
    for(i in 0 until N-1) {
        adjacent[i].sort()
    }
    var visited = BooleanArray(N + 1) { false }

    dfs(adjacent, 1, visited, 0)
    if (summ % 2 == 0) {
        print("No")
    } else print("Yes")
}

fun dfs(adjacent: Array<ArrayList<Int>>, start: Int, visited: BooleanArray, cnt: Int) {
    visited[start] = true

    for(i in 0 until adjacent[start].size) {
        var node = adjacent[start][i]
        if(adjacent[start].size == 1) {
            summ+=cnt
        }
        if(!visited[node]) {
            dfs(adjacent, node, visited, cnt+1)
        }
    }

}
