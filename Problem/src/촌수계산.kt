var answer = -1
fun main() {
    var n = readLine()!!.toInt()
    var target = readLine()!!.split(" ").map { it.toInt() }
    var m = readLine()!!.toInt()
    var adjacent = Array(n + 1) { arrayListOf<Int>() }
    var visit = BooleanArray(n + 1) { false }
    for (i in 0 until m) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        adjacent[input[0]].add(input[1])
        adjacent[input[1]].add(input[0])
    }
    for (i in adjacent.indices) {
        adjacent[i].sort()
    }
    dfs(target[0], target[1], visit, adjacent, 0)
   if(answer == -1) {
       print(answer)
   }
    else {
       print(answer)
   }
}

fun dfs(start: Int, target: Int, visit: BooleanArray, adjacent: Array<ArrayList<Int>>, cnt: Int) {
    visit[start] = true
    for(i in adjacent[start]) {
        if(!visit[i]) {
            if(i == target) {
                answer = cnt+1
                return
            }
            dfs(i, target, visit, adjacent, cnt+1)
        }
    }
}