import java.lang.StringBuilder

fun main() {
    solution("AB", 1)
}
fun solution(s: String, n: Int): String {
    var answer = ""
    var sb = StringBuilder()
    s.forEach {
        when (it) {
            in 'a'..'z' -> {
                var cmp = it.toInt()+n
                if(cmp > 122) {
                    cmp -= 26
                }
                var char = cmp.toChar()
                sb.append(char)
            }
            in 'A'..'Z' -> {
                var cmp = it.toInt()+n
                if(cmp > 90) {
                    cmp -= 26
                }
                var char = cmp.toChar()
                sb.append(char)
            }
            else -> {
                sb.append(it)
            }
        }
    }
    answer = sb.toString()
    return answer
}