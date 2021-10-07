import java.lang.Integer.max

fun main()  = with(System.`in`.bufferedReader()){
 var n = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map { it.toInt() }
    var dp = Array(list.size) {0}
    for(i in list.indices) {
        for(j in 0 until i) {
            if(list[j] < list[i]) {
                dp[i]= max(dp[i], dp[j])
            }
        }
        dp[i]++
    }
    print(dp.maxOrNull())
}