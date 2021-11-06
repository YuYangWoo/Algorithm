fun main() = with(System.`in`.bufferedReader()){
    val S = readLine()!!.toLong()
    val bw = System.out.bufferedWriter()
    var sum = 0L
    var cnt = 0
    var i =1
    while(true) {
        if(sum > S) {
            break
        }
        sum+=i
        i++
        cnt++
    }
    bw.write("${cnt-1}")
    bw.close()
}