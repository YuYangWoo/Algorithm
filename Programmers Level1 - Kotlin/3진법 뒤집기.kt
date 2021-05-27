import kotlin.math.pow

fun main() {
    solution(125)
}
fun solution(n: Int): Int {
    var number = n
    var answer: Int = 0
    var stringAnswer = ""
    while(number>=3) {// 45
        stringAnswer += number%3
        number /= 3
    }
    stringAnswer += number
    var array = ArrayList<Int>()
    for(i in stringAnswer) {
        array.add(i.toInt()-48)
    }

    for((po, i) in (array.size-1 downTo 0).withIndex()) {
        answer += array[i]* 3.0.pow(po).toInt()
    }

    return answer
}