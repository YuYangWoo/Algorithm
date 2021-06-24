import java.lang.StringBuilder
import kotlin.math.*

fun main() {
    solution(intArrayOf(0,0,1,1,5,7,9,9,3,0,1,2,3), "left")
}
fun solution(numbers: IntArray, hand: String): String {
    var answer = StringBuilder()
    var lnow: Int = 10
    var rnow: Int = 12

    var list = ArrayList<Int>()
    for(i in numbers.indices) {
        if(numbers[i] == 0) {
            list.add(11)
        }
        else {
            list.add(numbers[i])
        }
    }
    //                    1         2         3
    var xy = arrayOf(Pair(0,0), Pair(0,1), Pair(0,2),
                     Pair(1,0), Pair(1,1), Pair(1,2),
                     Pair(2,0), Pair(2,1), Pair(2,2),
                     Pair(3,0), Pair(3,1), Pair(3,2))

    list.forEach {

        if(it == 1 || it == 4 || it ==7) {
            answer.append("L")
            lnow = it
        }
        else if(it == 3 || it == 6 || it ==9) {
            answer.append("R")
            rnow = it
        }
        else {
         var length = distance(xy[it-1], xy[lnow - 1], xy[rnow - 1])
            if(length.first > length.second) {
                answer.append("R")
                rnow = it
            }
            else if(length.first < length.second) {
                answer.append("L")
                lnow = it
            }
            else {
                if(hand == "right") {
                    answer.append("R")
                    rnow = it
                }
                else {
                    answer.append("L")
                    lnow = it
                }
            }
        }

    }
    println(answer.toString())
    return answer.toString()
}

fun distance(destination: Pair<Int, Int>, l: Pair<Int, Int>, r: Pair<Int, Int>): Pair<Int, Int> {
    var lLength = abs(destination.first - l.first) + abs(destination.second - l.second)
    var rLength = abs(destination.first - r.first) + abs(destination.second - r.second)
    var length = Pair(lLength, rLength)
    return length
}
