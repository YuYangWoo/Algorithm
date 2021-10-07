
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        var lottoArray = ArrayList<Int>()
        var input = readLine().split(" ").map { it.toInt() }.toIntArray()
        var k = input[0]
        if(k == 0) return@with
        for(i in 1 until input.size) {
            lottoArray.add(input[i])
        }
        checkArrayyz = BooleanArray(lottoArray.size+1){false}
        logggg = IntArray(6){0}
        dfsza(0, lottoArray, k, 0)
        println()
    }
}
lateinit var logggg: IntArray
lateinit var checkArrayyz: BooleanArray
fun dfsza(index: Int, lotto: ArrayList<Int>, k: Int, start: Int) {
    if(index == 6) {
        logggg.forEach { print("${it} ") }
        println()
        return
    }

    for(i in start until lotto.size) {
        if(checkArrayyz[i]) continue
        logggg[index] = lotto[i]
        checkArrayyz[i] = true
        dfsza(index + 1, lotto, k, i)
        checkArrayyz[i] = false
    }
}