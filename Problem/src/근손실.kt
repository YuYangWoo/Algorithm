lateinit var kits:IntArray
lateinit var checkArray: BooleanArray
lateinit var logg:IntArray
fun main() = with(System.`in`.bufferedReader()) {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    kits = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    logg = IntArray(n) {0}
    checkArray = BooleanArray(n) {false}
    dfs(0,n,500,k)
    println(countGun)
}
var countGun = 0
fun dfs(day: Int, n:Int, start: Int, k: Int) {
    if(day == n) {
        countGun++
        return
    }
    for(kit in kits.indices) {
        if(checkArray[kit]) continue
        checkArray[kit] = true
        logg[day] = kits[kit]
        if(start-k+logg[day] >= 500) {
            dfs(day + 1, n, start-k+logg[day], k)
        }
        checkArray[kit] = false
    }
}