import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }
    var arrayList = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var list = Array(M) { 0 }
    arrayList.sort()
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var visited = BooleanArray(N) { false }
    dfsssss(N, M, 0, arrayList, list, bw, visited)
    bw.close()
}

fun dfsssss(
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
                list[start] = arrayList[i]
                dfsssss(N, M, start + 1, arrayList, list, bw, visited)
        }
    }
}