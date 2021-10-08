import java.lang.Math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    logs = IntArray(n) {0}
    checkArrs = BooleanArray(n+1) {false}
    sumArrayz= ArrayList<Int>()
    dfsq(0,n,array)
  print(sumArrayz.maxOrNull())
}
lateinit var sumArrayz:ArrayList<Int>
lateinit var logs: IntArray
lateinit var checkArrs: BooleanArray
fun dfsq(index: Int, n: Int, array: IntArray) {
    if(index == n) {
        var sum = 0
        for(i in 0 until logs.size-1) {
            sum += abs(logs[i] - logs[i+1])
        }
        sumArrayz.add(sum)
        return
    }
    for(i in array.indices) {
        if(checkArrs[i]) continue
        logs[index] = array[i]
        checkArrs[i] = true
        dfsq(index +1, n, array)
        checkArrs[i] = false
    }

}