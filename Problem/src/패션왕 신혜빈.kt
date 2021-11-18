fun main() {
    val T = readLine()!!.toInt()
    for(i in 0 until T) {
        val n = readLine()!!.toInt()
        var hm = HashMap<String,Int>()
        for(j in 0 until n) {
            var input = readLine()!!.split(" ").map { it }
            hm[input[1]] = (hm[input[1]]?:0)+1
        }
        var count = 1
        hm.forEach {(key,value) ->
            count *= (value+1)
        }
        println(count-1)
    }
}