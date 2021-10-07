fun main() {
    print(solutionv(3, arrayOf(intArrayOf(1,1,0),intArrayOf(1,1,0),intArrayOf(0,0,1))))
}

var cnttt = 0
fun solutionv(n: Int, computers: Array<IntArray>): Int {
    var answer = 0
    var adajacent = Array(n){ arrayListOf<Int>()}
    var visit = BooleanArray(n) {false}
    for(i in computers.indices) {
        for(j in computers[0].indices) {
            if(i != j && computers[i][j] == 1) adajacent[i].add(j)
        }
    }

    for(i in adajacent.indices) {
        adajacent[i].sort()
    }

    for(i in 0 until n) {
        dfs(i, visit, adajacent)
    }
    answer = n-cnttt
    return answer
}
fun dfs(start: Int, visit:BooleanArray, adjacent: Array<ArrayList<Int>>) {
    visit[start] = true

    for(i in adjacent[start].indices) {
        var node = adjacent[start][i]
        if(!visit[node]) {
            dfs(node, visit, adjacent)
            cnttt++
        }
    }
}