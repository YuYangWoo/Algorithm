fun main() {
    print(solutionzx(intArrayOf(1,2,3,4,6,7,8,0)))
}
fun solutionzx(numbers: IntArray): Int {
    var answer: Int = 0
    var list = Array(10){0}
    numbers.forEach { list[it]++ }
    for(i in list.indices) {
        if(list[i] == 0) {
            answer += i
        }
    }
    return answer
}