import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()){
    var T = readLine()!!.toInt()
    for(i in 0 until T) {
        var point = readLine()!!.split(" ").map { it.toInt() }
        var x1 = point[0].toDouble()
        var y1 = point[1].toDouble()
        var r1 = point[2].toDouble()
        var x2 = point[3].toDouble()
        var y2 = point[4].toDouble()
        var r2 = point[5].toDouble()

        var distance = Math.pow(x2-x1,2.0) + Math.pow(y2-y1, 2.0)
        when {
            x1==x2 && y1 == y2 && r1==r2 -> { //무수히 많을 때
                println(-1)
            }
            distance > (r1 + r2).pow(2.0) -> {
                println(0)
            }
            distance < Math.pow(r2-r1,2.0) -> {
                println(0)
            }
            distance == Math.pow(r2-r1,2.0) -> {
                println(1)
            }
            distance == Math.pow(r2+r1,2.0) -> {
                println(1)
            }
            else -> {
                println(2)
            }
        }

    }
}