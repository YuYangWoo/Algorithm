fun main() {
    val (N,S) = readLine()!!.split(" ").map { it.toInt() }
    val input = readLine()!!.split(" ").map { it.toInt() }
    checkArrayyy = BooleanArray(N) {false}
    dffs(input,S,0)
}
var countz = 0
lateinit var checkArrayyy: BooleanArray
fun dffs(input: List<Int>, S: Int, sum: Int) {
    if(sum == S) {
        countz++
        return
    }
    for(i in input.indices) {

    }

}