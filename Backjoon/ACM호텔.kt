import java.lang.StringBuilder

fun main() {
    var T = readLine()!!.toInt()
    for (i in 0 until T) {
        var (H, W, N) = readLine()!!.split(" ").map { it.toInt() }
       var stair = if(N%H == 0) {
           H
       }
        else {
            N%H
       }
        var room = if(N%H == 0) {
        //방번호
            N/H
        }
        else {
            N/H+1
        }
        var sb = StringBuilder()
        sb.append(stair)
        if(room >= 10) {
            sb.append(room)
        }
        else {
            sb.append(0)
            sb.append(room)
        }
        println(sb.toString())
        sb.clear()
    }
}
