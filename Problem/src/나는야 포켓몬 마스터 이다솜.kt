fun main() {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    var list = ArrayList<String>()
    var map = HashMap<String,String>()
    var count = 1
    (0 until n).forEach { i ->
        val input = readLine()!!
        map[input] = count.toString()
        count++
        list.add(input)
    }
    count = 1
    for(i in list) {
        map[count.toString()] = i
        count++
    }
    for(i in 0 until m) {
        var input = readLine()!!
        if(map.containsKey(input)) {
            println(map[input])
        }
    }
}