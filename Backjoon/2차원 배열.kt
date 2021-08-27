fun main() {
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var arrayList = Array(N) { IntArray(M)}

    for(i in 0 until N) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        for(j in 0 until M) {
            arrayList[i][j] = input[j]
        }
    }
    var K = readLine()!!.toInt()

    for(i in 0 until K) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        var sum = 0
        for(j in input[0]-1 until input[2]) {
            for(z in input[1]-1 until input[3]) {
                sum+=arrayList[j][z]
            }
        }
        println(sum)
    }
}