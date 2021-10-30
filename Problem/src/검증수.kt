fun main() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0.0
    for(i in list.indices) {
        sum +=Math.pow(list[i].toDouble(), 2.0)
    }
    print((sum % 10).toInt())
}