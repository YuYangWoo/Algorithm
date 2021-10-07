import java.io.BufferedWriter
import java.io.OutputStream
import java.io.OutputStreamWriter
var bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var plusList = ArrayList<Int>()
    var A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var B = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    for(i in 0 until N) {
        plusList.add(A[i])
    }
    for(j in 0 until M) {
        plusList.add(B[j])
    }
    plusList.sorted().forEach { bw.write("$it ") }
  bw.close()
}