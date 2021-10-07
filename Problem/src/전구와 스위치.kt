import java.lang.StringBuilder
import kotlin.math.min
var temp = StringBuilder()
var cntttt = 0
var answerr = 999999
fun main()  = with(System.`in`.bufferedReader()){
    var n = readLine()!!.toInt()
    var led = readLine()
    var willBeLed = readLine()
    simulate(0,led,willBeLed)
    simulate(1, led, willBeLed)
    if(answerr == 999999){
        print(-1)} else print(answerr)
}
fun simulate(start: Int, led: String, willBeLed: String){
    cntttt = 0
    temp.append(led)
    if(start == 0) {
        temp.setCharAt(0, if(temp[0] == '1') '0' else '1')
        temp.setCharAt(1, if(temp[1] == '0') '1' else '0')
        cntttt++
    }
    for(i in 1 until led.length) {
        if(temp[i-1] != willBeLed[i-1]){
            light(i,led, willBeLed)
            cntttt++
        }
    }
    if(temp.toString() == willBeLed) {
        answerr = min(cntttt,answerr)
    }
    temp.clear()
}

fun light(start: Int, led: String, willBeLed: String) {
   if(start >0) temp.setCharAt(start-1, if(temp[start-1] == '1') '0' else '1')
   temp.setCharAt(start, if(temp[start] == '0') '1' else '0')
    if(start < led.length-1)temp.setCharAt(start+1, if(temp[start+1] == '0') '1' else '0')
}