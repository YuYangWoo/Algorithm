import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var T = readLine()!!.toInt()
    for(i in 0 until T) {
        var N = readLine()!!.toInt()
        var arrayList = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        arrayList.sort()
        print("${arrayList[0]} ${arrayList[arrayList.size-1]}\n")
    }
}