import java.util.*
import kotlin.Comparator
import kotlin.collections.HashMap

fun main() {
    var N = readLine()!!.toInt()
    var array = Array<String>(N){""}
    var hashMap = HashMap<String,Int>()
    for(i in 0 until N) {
        array[i] = readLine()!!.toString()
    }
    for(i in array.indices) {
        if(hashMap.containsKey(array[i].split(".")[1])) {
            hashMap[array[i].split(".")[1]] = hashMap[array[i].split(".")[1]]!! +1
        }
        else {
            hashMap[array[i].split(".")[1]] = 1

        }

    }

    var answer = hashMap.toSortedMap(compareBy {it})
    for((k,v) in answer) {
        println("$k $v")
    }
}