import java.util.*
import kotlin.math.abs

fun main() {
    var input = "onetwo34five67"
    input = input.replace("one","1").replace("two","2").replace("five","5")
    println(input)
    println(input.substring(1,3))
    var a = "35"
    var b = 123
    println(b.toString())
    var hm = TreeMap<String,Int>()
    hm["SI"] = 1
    hm["hardware"] = 2
    hm["abc"] = 3
    var aray = intArrayOf(3,5,7,1,2,3,4,10,8)
    aray.maxOrNull()
    hm.toList().sortedBy { it.second }.toMap().toMutableMap()
    if(hm.containsKey("SI") && hm.containsValue(1)) {
        print("빠끄빠끄빠끄")
    }
    var abdd = "abcdefg"
    var sb = StringBuilder()
    sb.append(abdd.toString())
    sb.deleteCharAt(0)
    sb.insert(3,"abc")
    var add = -7
    println(abs(add))
    var abc = arrayOf("abc","bcf","aa")
    abc.sortDescending()
    abc.forEach { print(it) }
    print(hm["SI"]!! +3)
}