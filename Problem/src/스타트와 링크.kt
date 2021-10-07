import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

lateinit var arr: Array<ArrayList<Int>>
lateinit var check: BooleanArray
lateinit var startArray: IntArray
lateinit var linkArray: ArrayList<Int>
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    arr = Array(n) { arrayListOf<Int>() }
    check = BooleanArray(n+1) { false }
    startArray = IntArray(n/2){0}
    linkArray = ArrayList<Int>()
    for (i in 0 until n) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        for (j in input.indices) {
            arr[i].add(input[j])
        }
    }
    dfsas(n,0,n/2, 1)
    var bw = BufferedWriter(OutputStreamWriter(System.out))
//    bw.write("${Sum.minOrNull()}")
    bw.write("${min}")
    bw.close()

}
//var Sum = ArrayList<Int>()
var min = 2147483647
fun dfsas(n: Int, index: Int, m:Int, start: Int) {
    linkArray.clear()
    if(index == m) { // 여기서 나머지 check값을 비교해서 능력치를 비교
        for(i in 1..check.size-1) {
            if(!check[i]) {
                linkArray.add(i)
            }
        }
        var sum=0
        var sum1=0
        for(i in 0 until startArray.size-1) { // 6 1 2 /61 62 16 26
         for(j in i+1.. startArray.size-1) {
             //01 02 12
             sum+=arr[startArray[i]-1][startArray[j]-1]
             sum+=arr[startArray[j]-1][startArray[i]-1]
             sum1+=arr[linkArray[i]-1][linkArray[j]-1]
             sum1+=arr[linkArray[j]-1][linkArray[i]-1]
         }
        }
        if(min >abs(sum-sum1)) {
            min = abs(sum-sum1)
        }
//        startArray.forEach { print(it) }
//        println("여기까지 startArray")
//        linkArray.forEach { print(it) }
//        println("여기까지 linkArray")
//        Sum.add(abs(sum-sum1))
        return
    }

    for(i in start..n) {
        if(check[i]) continue
//        if(index ==0 && i>=2) return
        check[i] = true
        startArray[index] = i //시간초과 걸리면 앞자리 m이하면 break
        dfsas(n,index + 1, n/2, i+1)
        check[i] = false
    }
}