fun main() {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    var hashMap = HashMap<String,Int>()
    var count = 0
    for(i in 0 until n) {
        hashMap[readLine()!!] = 0
    }
    for(i in 0 until m) {
        if(hashMap.containsKey(readLine()!!)) {
            count++
        }
    }

    print(count)
}

