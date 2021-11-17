fun main() = with(System.`in`.bufferedReader()){
    val bw = System.out.bufferedWriter()
    var hashMap = HashMap<Int, Int>()
    val N = readLine()!!.toInt()
    var input = readLine()!!.split(" ").map { it.toInt() }
    for (j in input) {
        hashMap[j] = (hashMap[j] ?: 0) + 1
    }
    val M = readLine()!!.toInt()
    var guhada = readLine()!!.split(" ").map { it.toInt() }
    for (i in guhada) {
        if (hashMap.containsKey(i))
        bw.write("${hashMap[i]} ")
        else
        bw.write("${0} ")
    }
    bw.close()
}