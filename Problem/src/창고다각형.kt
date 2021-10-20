import java.lang.Math.max

fun main() = with(System.`in`.bufferedReader()){
    val bw = System.out.bufferedWriter()
    val n = readLine()!!.toInt()
    val arr = Array(n) {edge()}
    var maxValue = Integer.MIN_VALUE
    for(i in 0 until n) {
        var input = readLine().split(" ").map { it.toInt() }
        arr[i].pos = input[0]
        arr[i].height = input[1]
        maxValue = max(maxValue,arr[i].height)
    }

    arr.sortWith(Comparator { o1, o2 ->
        return@Comparator o1.pos-o2.pos
    })
    var sum = 0
    var maxCount = 0
    var maxArray = ArrayList<Int>()
    for(i in arr.indices) {
        if(arr[i].height == maxValue) {
            maxCount++
            maxArray.add(arr[i].pos)
        }
    }
//    sum += maxArray.size * maxValue
    sum += (((maxArray[maxArray.size-1]+1)- maxArray[0]) * maxValue)
    var z = 0
    var flag = false
    while(true) {
        if(arr[z].height == maxValue) break
        for(j in z+1 until arr.size) {
            if(arr[z].height < arr[j].height) {
                sum += ((arr[j].pos - arr[z].pos) * arr[z].height)
                if(arr[j].height == maxValue) {
                    flag = true
                }
                z = j
                break
            }
        }
        if(flag) break
    }

    var x = arr.size - 1
    flag = false
    while(true) {
        if(arr[x].height == maxValue) break
        for(j in arr.size-2 downTo  0) {
            if(arr[x].height< arr[j].height) {
                sum += (((arr[x].pos+1) - (arr[j].pos+1)) * arr[x].height)
                if(arr[j].height == maxValue) {
                    flag = true
                }
                x = j
                break
            }
        }
        if(flag)break
    }

    bw.write("${sum}")



//    for(i in arr.indices) {
//        println("${arr[i].pos} ${arr[i].height}")
//    }

    bw.close()
}
data class edge(var pos:Int = 0, var height:Int = 0)