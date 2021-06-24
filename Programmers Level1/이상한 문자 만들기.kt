import java.lang.StringBuilder

fun main() {
solution("try hello world")
}
fun solution(s: String): String {
    var answer = StringBuilder()
    var list = s.split(" ").joinToString(" ")
    print(s.split(" "))
    print(s.split(" ").joinToString("'"))
//    list.forEach {
//        var string = it
//        for(i in string.indices) {
//            if(i%2==0) {
//                if(string[i] in 'a'..'z') {
//                    answer.append((string[i].toInt() - 32).toChar())
//                }
//                else {
//                    answer.append(string[i])
//                }
//            }
//            else {
//                if(string[i] in 'A'..'Z') {
//                    answer.append((string[i].toInt() + 32).toChar())
//                }
//                else {
//                    answer.append(string[i])
//                }
//            }
//        }
//        answer.append(" ")
//    }
//    answer.deleteCharAt(answer.toString().length-1)
//    print(answer.toString())
    return answer.toString()
}