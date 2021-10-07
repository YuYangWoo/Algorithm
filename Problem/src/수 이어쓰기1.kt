fun main() = with(System.`in`.bufferedReader()){
    var N = readLine()!!.toInt()
    var cnt = 0
    for(i in 1..N) {
        cnt += i.toString().length
    }
    print(cnt)
}