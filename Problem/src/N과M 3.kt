import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var arrayList = Array(N) {0}
    dfs(N, M, 0, arrayList,bw)
    bw.close()
}

fun dfs(N: Int, M: Int, start: Int, arrayList: Array<Int>, bw: BufferedWriter) {
    if(start == M) {
        for(i in 0 until M) {
            bw.write("${arrayList[i]} ")
        }
        bw.write("\n")
    }
    else {
        for(i in 1..N) {
            arrayList[start] = i
            dfs(N, M, start+1, arrayList, bw)
        }
    }

}