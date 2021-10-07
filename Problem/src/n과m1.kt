fun main() {
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    // 1부터 N까지 자연수 중에서 중복없이 M개를 고른 수열
    /// 3까지 123
    var arr = Array(M) {0}
    checkArrayy = BooleanArray(N+1){false}
    dfsas(N,M,0,arr)
}
lateinit var checkArrayy: BooleanArray
fun dfsas(n: Int, m: Int, index: Int, arr:Array<Int>) {
    if(index == m) {
        arr.forEach { print("${it} ") }
        println()
        return
    }
    for(i in 1 .. n) {
        if(checkArrayy[i]) continue
        arr[index] = i
        checkArrayy[i] = true
        dfsas(n,m,index +1,arr)
        checkArrayy[i] = false
    }
}