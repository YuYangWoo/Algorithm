fun main() {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }
    var array = Array(N) { Array(M) { "" } }
    for (i in 0 until N) {
        var input = readLine()
        for (j in 0 until M) {
            array[i][j] = input!![j].toString()
        }
    }

    for (i in 0 until array.size - 8) { // 0 1 2
        for (j in 0 until array[0].size - 8) { // 0 1 2 3 4
            check(i, j, array)
        }
    }
}

fun check(x: Int, y: Int, array:Array<Array<String>>) {

    // 왼쪽 위가 블랙일 때
    for(i in x until array.size - 8) { // 00 01 02 03 04 05 06 07 08 10 11 12 13
        for(j in y until array[0].size - 8) {

        }
    }
    // 왼쪽 위가 화이트일 때
}