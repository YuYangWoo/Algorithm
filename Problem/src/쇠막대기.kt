import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(System.`in`.bufferedReader()) {
    var s = readLine()!!.toString()
    var cnt=0
    var ans=0
    var i=0
    while(i<s.length){
        when(s[i]) {
            '(' -> {
                if(s[i+1] == ')') {
                    ans += cnt
                    i++
                }
                else {
                    cnt++
                }
            }
            else -> {
                ans++
                cnt--
            }
        }
        i++
    }
    println(ans)
}