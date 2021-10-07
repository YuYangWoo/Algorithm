fun main() = with(System.`in`.bufferedReader()) {
    var T = readLine()!!.toInt()
    for(i in 0 until T) {
        var k = readLine()!!.toInt()
        var n = readLine()!!.toInt()
        var array = Array(k+1) {Array(n){0} }
        for(i in 0 until n) {
            array[0][i] = i+1
        }
        for(i in 1 .. k) {
            for(j in 0 until n) {
                for(z in 0 .. j) {
                    array[i][j] += array[i-1][z]
                }
            }
        }
        println(array[k][n-1])
    }
}