var N = 0
var M = 0
var countt: Int = 0
fun main() {
     N = readLine()!!.toInt()
     M = readLine()!!.toInt()
    var check = BooleanArray(N+1)
    var adjacent = Array(N+1) {IntArray(N+1)}
    repeat(M) {
        var (a,b) = readLine()!!.split(" ").map { it.toInt() }
        adjacent[a][b] = 1
        adjacent[b][a] = 1
    }
    startDfs(1,check, adjacent)
    print(countt)
}

fun startDfs(start: Int, check: BooleanArray, adjacent: Array<IntArray>) {
    check[start] = true
    for(i in 1..N) {
        if(!check[i] && adjacent[start][i] == 1) {
            startDfs(i, check, adjacent)
            countt++

        }
    }

}