fun main() {
    var N = readLine()!!.toInt()
    var mineArray = Array(N) { arrayOf("a")}
    for(i in mineArray.indices) {
        for(j in mineArray[0].indices) {
            print(mineArray[i][j])
        }
    }
//    for (i in 0 until N) {
//        var input = readLine().toString()
//        for (j in input.indices) {
//            mineArray[i][ = input[j]
//        }
//    }
}