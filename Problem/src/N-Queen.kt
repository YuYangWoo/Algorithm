fun main() = with(System.`in`.bufferedReader()){
    var N = readLine()!!.toInt()
    var chess = Array(N) {Array(N){0} }
    dfsQueen(N,chess)
}
fun dfsQueen(N: Int, chess:Array<Array<Int>>) {

}
