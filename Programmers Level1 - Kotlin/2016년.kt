import java.util.*

var month = arrayOf("SUN","MON","TUE","WED","THU","FRI","SAT")
fun main() {
    solutions(5, 24)
}

fun solutions(a: Int, b: Int): String {
    var answer = ""
    var cal = Calendar.getInstance()
    cal.set(Calendar.YEAR, 2016)
    cal.set(Calendar.MONTH, a - 1)
    cal.set(Calendar.DAY_OF_MONTH, b)
    answer = month[cal.get(Calendar.DAY_OF_WEEK) - 1]
    return answer
}
