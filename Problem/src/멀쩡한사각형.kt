import kotlin.math.ceil

fun main() {
        solution(8,12)
    }
    fun solution(w: Int, h: Int): Long {
        var answer: Long = 0
        if(w == h) {
            return ((w*h)-w).toLong()
        }
        if(w ==1 || h == 1) {
            return 0
        }
        for(i in 1..w) {
            val ceil = ceil(h.toDouble() / w * 1)
            answer += ceil.toLong()
        }

        println((w*h)/2 - answer)
        return answer*2
    }

//fun solution(w: Int, h: Int): Long {
//    var answer: Long = 0
//    if(w == h) {
//        return ((w*h)-w).toLong()
//    }
//    if(w ==1 || h == 1) {
//        return 0
//    }
//    for(i in 1..w) {
//        val ceil = ceil(h.toDouble() / w * i)
//        answer += h-ceil.toLong()
//    }
//
//    println(answer*2)
//    return answer*2
//}
