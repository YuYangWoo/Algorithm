fun main() {
    var (x,y) = readLine()!!.split(" ").map { it.toInt() }
    //321 001 322 223
    var newX = x.toString().reversed()
    var newY = y.toString().reversed()
    print((newX.toInt() + newY.toInt()).toString().reversed().toInt())
}