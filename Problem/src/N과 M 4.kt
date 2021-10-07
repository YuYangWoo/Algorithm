import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }
    var arrayList = Array(M) { 0 }
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    dfss(N, M, 0, arrayList, bw)
    bw.close()
}

fun dfss(N: Int, M: Int, start: Int, arrayList: Array<Int>, bw: BufferedWriter) {
    if (start == M) {
        var flag = false
        var cnt = 0
        for (i in 0 until M) {
            if (i+1 <M && arrayList[i] <= arrayList[i + 1]) {
               cnt++
            }
        }
        if(cnt == M-1) {
            flag = true
        }
        if (flag) {
            for (i in 0 until M) {
                bw.write("${arrayList[i]} ")
            }
            bw.write("\n")
        }

    } else {
        for (i in 1..N) {
            arrayList[start] = i
            dfss(N, M, start + 1, arrayList, bw)
        }
    }

}