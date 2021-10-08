import java.lang.Math.abs

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()!!.toInt()
    var sum = 0
    dfs(0, n)
    print(summz)
}
var listt = IntArray(15){0}
var summz = 0
fun dfs(index: Int, n: Int) {
    if(index == n) {
        summz++
        return
    }
    for(i in 1..n) {
        listt[index] = i
        if(checkz(index)) {
            dfs(index + 1, n)
        }
    }
}
fun checkz(index: Int): Boolean {
    for(i in 0 until index) {
        if(listt[index] == listt[i] || abs(listt[index] - listt[i]) == (index-i)) return false
    }
    return true
}
