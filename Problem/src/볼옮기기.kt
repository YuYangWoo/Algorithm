import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var N = readLine()!!.toInt()
    var input = readLine()
    var list = ArrayList<Int>()
    var answerList = Array(4){0}
    //RBBBRBRRR 1 3 1 1 3
    var i =0
    var cnt = 1
    while(i < input.length) {
        if(i+1 < input.length && input[i] === input[i+1]) {
            cnt++
        } else {
            list.add(cnt)
            cnt = 1
        }
        i++
    }
    // 2 1 4 1
    for(i in list.indices) {
        if(i % 2 == 0 && i != 0) { // 짝수
            answerList[0] += list[i]
        }
       if(i%2 == 0 && i != list.size-1) {
           answerList[1] += list[i]
       }
        if(i%2 == 1 ) {
            answerList[2] += list[i]
        }
        if(i%2 == 1 && i != list.size - 1) {
            answerList[3] += list[i]
        }

    }
    bw.write("${answerList.minOrNull()}")
    bw.close()

}