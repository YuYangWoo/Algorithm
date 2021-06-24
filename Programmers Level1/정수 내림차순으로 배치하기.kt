fun main() {
    solutionzz(118372)
}

fun solutionzz(n: Long): Long {
    var answer: Long = 0
    var string = n.toString()
    var array = ArrayList<Int>()
    for (i in string.indices) {
        array.add(string[i] - '0')
    }
    array.sortDescending()
    var stringBuilder = StringBuilder()
    array.forEach {
        stringBuilder.append(it)
    }
    answer = stringBuilder.toString().toLong()
    return answer
}