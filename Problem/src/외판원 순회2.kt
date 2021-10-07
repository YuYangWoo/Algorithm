lateinit var array: Array<ArrayList<Int>>
lateinit var checkArr: BooleanArray
lateinit var loggg: IntArray
fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()!!.toInt()
    array = Array(n) { arrayListOf<Int>() }
    checkArr = BooleanArray(n) { false }
    loggg = IntArray(n) { 0 }
    for (i in 0 until n) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        for (j in input.indices) {
            array[i].add(input[j])
        }
    }
    for (i in array.indices) {
//        println("시작 ${i}")
        checkArr[i] = true
        dfszx(0, n, i, i)
        checkArr = BooleanArray(n) { false }
    }
    print(sumArray.minOrNull())
}

var sumArray = ArrayList<Int>()

// 첫 번 째 문제점. 처음? 떠나는 도시를 check 해야하는데 못하고 있음
fun dfszx(index: Int, n: Int, start: Int, destination: Int) {
    if (index == n - 1 && array[destination][start] != 0) {
        loggg[index] = array[destination][start]
//        print("${checkArr.contentToString()}")
//        println(loggg.contentToString() +  "  ${loggg.sum()}" +   "  ${array[destination][start]}")
        sumArray.add(loggg.sum())
        return
    }
    for (i in array[0].indices) {
        if (checkArr[i]) continue
        if (array[destination][i] == 0) continue
        checkArr[i] = true
        loggg[index] = array[destination][i]
        dfszx(index + 1, n, start, i)
        checkArr[i] = false
    }

}