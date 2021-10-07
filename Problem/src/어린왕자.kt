import kotlin.math.pow

fun main() {
    var T = readLine()!!.toInt()
    for(i in 0 until T) {
        var point = readLine()!!.split(" ").map { it.toInt() }
        var x1 = point[0]
        var y1 = point[1]
        var x2 = point[2]
        var y2 = point[3]
        var cX = ArrayList<Double>()
        var cY = ArrayList<Double>()
        var cR = ArrayList<Double>()
        var n = readLine()!!.toInt()
        var answer = 0
        for(i in 0 until n) {
            var cnt = 0
            var cnt1 = 0
            var info = readLine()!!.split(" ").map { it.toDouble() }
            cX.add(info[0])
            cY.add(info[1])
            cR.add(info[2])

            if(cR[i].pow(2.0) > (cX[i] - x1).pow(2.0) + (cY[i] - y1).pow(2.0)) {
                cnt++
            }
            if(cR[i].pow(2.0) > (cX[i] - x2).pow(2.0) + (cY[i] - y2).pow(2.0)) {
                cnt1++
            }
            if(cnt != cnt1) {
                answer++
            }
        }
        println(answer)

    }
}