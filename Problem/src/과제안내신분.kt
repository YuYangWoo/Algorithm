fun main() {
    var array = IntArray(31){0}
    for(i in 0 until 28) {
        var a = readLine()!!.toInt()
        array[a]++
    }
    for(i in 1..30) {
        if(array[i] == 0) {
            print(i)
            println()
        }
    }
}