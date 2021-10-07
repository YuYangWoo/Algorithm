import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()){
    var n = readLine()!!.toInt()
    var up = 1
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var down = 2
    var cnt = 2
    when (n) {
        1 -> {
            bw.write("1/1")
            bw.close()
        }
        2 -> {bw.write("${up}/${down}")
            bw.close()}
        else -> {
            for (i in 2..n) {
                for(j in 0 until i) {
                    if (i % 2 == 0) {//짝수 {
                        up += 1
                        down -= 1
                    } else {
                        up -= 1
                        down += 1
                    }
                    if(up == 0) {
                        up = 1
                    } else if(down == 0) {
                        down = 1
                    }
                    cnt++
                    if(cnt == n) {
                        bw.write("${up}/${down}")
                        bw.close()
                        return
                    }
                }
            }
        }
    }

}