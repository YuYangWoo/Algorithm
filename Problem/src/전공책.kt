fun main() = with(System.`in`.bufferedReader()) {
    var bw = System.out.bufferedWriter()
    var T = readLine()
    var n = readLine().toInt()
    var array = Array(n) {book(0,"")}
    for(i in 0 until n) {
        val input = readLine()!!.split(" ")
        array[i].price = input[0].toInt()
        array[i].name = input[1]
    }
    bw.close()
}
data class book(var price: Int = 0, var name: String = "")