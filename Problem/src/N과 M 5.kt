import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }
    var arrayList = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var list = Array(M) { 0 }
    arrayList.sort()
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var visited = BooleanArray(N) { false }
    dfsss(N, M, 0, arrayList, list, bw, visited)
    bw.close()
}

fun dfsss(
    N: Int,
    M: Int,
    start: Int,
    arrayList: IntArray,
    list: Array<Int>,
    bw: BufferedWriter,
    visited: BooleanArray
) {
    if (start == M) {

            for (i in 0 until M) {
                bw.write("${list[i]} ")
            }
            bw.write("\n")

    } else {
        for (i in arrayList.indices) {
            if(!visited[i]) {
                list[start] = arrayList[i]
                visited[i] = true
                dfsss(N, M, start + 1, arrayList, list, bw, visited)
                visited[i] = false
            }
        }
    }
}