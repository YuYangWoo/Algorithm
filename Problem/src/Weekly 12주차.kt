import kotlin.math.max

fun main() {
    solutionaaa(80, arrayOf(intArrayOf(80, 20), intArrayOf(50, 40), intArrayOf(30, 10),intArrayOf(40, 20), intArrayOf(10,10)))
}

lateinit var checkArrr: BooleanArray
lateinit var orderArr: IntArray
fun solutionaaa(k: Int, dungeons: Array<IntArray>): Int {
    var answer: Int = -1
    checkArrr = BooleanArray(dungeons.size + 1)
    orderArr = IntArray(dungeons.size)
    var arr = ArrayList<firodo>()
    for (i in dungeons.indices) {
        arr.add(firodo(dungeons[i][0], dungeons[i][1]))
    }
    dfs(0, arr, k)
    answer = maxDungeon
    print(answer)
    return answer
}

var maxDungeon = Integer.MIN_VALUE
fun dfs(index: Int, arr: ArrayList<firodo>, k: Int) {
    if (index == arr.size) {
//        print(orderArr.contentToString())
        var now = k
        var count = 0
        for (i in orderArr.indices) {
            //공식
//            if (now >= arr[orderArr[i] - 1].min && now - arr[orderArr[i] - 1].firo >= 0) {
//                now -= arr[orderArr[i] - 1].firo
//                count++
//            }

            if(now >= arr[orderArr[i]-1].min) {
                if(now <=0) {
                    break
                }
                now-=arr[orderArr[i]-1].firo
                count++
            }
        }
        maxDungeon = max(count, maxDungeon)
        return
    }
    for (i in 1..arr.size) {
        if (checkArrr[i]) continue
        checkArrr[i] = true
        orderArr[index] = i
        dfs(index + 1, arr, k)
        checkArrr[i] = false
    }
}

data class firodo(var min: Int = 0, var firo: Int = 0)