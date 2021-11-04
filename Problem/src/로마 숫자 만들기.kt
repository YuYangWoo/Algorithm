fun main() = with(System.`in`.bufferedReader()){
    val n = readLine()!!.toInt()
    val bw = System.out.bufferedWriter()
    chkArray = BooleanArray(1001) {false}
    var arr = intArrayOf(1,5,10,50)
    ddfs(n,0, arr, 0, 0)
    bw.write("$ccnt")
    bw.close()
}
var ccnt = 0
lateinit var chkArray: BooleanArray
var answerL = Array(20){0}

fun ddfs(n: Int, index: Int, arr: IntArray, sum: Int, start: Int) {
    if(n == index) {
        if(!chkArray[answerL.sum()]) {
            ccnt++
            chkArray[answerL.sum()] = true
        }
        return
    }
    for(i in start until arr.size) {
        answerL[index] = arr[i]
        ddfs(n, index + 1, arr ,sum + arr[i], i)
    }
}