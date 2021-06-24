import java.lang.StringBuilder

fun main() {
    solutionq(3)
}
fun solutionq(n: Int): String {
    var answer = StringBuilder()
    for(i in 0 until n) {
        if(i%2==0) {
            answer.append("수")
        }
        else {
            answer.append("박")
        }
    }
    return answer.toString()
}