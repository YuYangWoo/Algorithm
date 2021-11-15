import kotlin.math.max
fun main() {
print(solutionzxcv("bbbab"))
}

fun solutionzxcv(S: String): Int {
    var now = S.first()
    var builder = StringBuilder("$now")
    val list = ArrayList<String>()
    for (i in 1 until S.length) {
        if (S[i] != now) {
            list.add(builder.toString())

            now = S[i]
            builder = StringBuilder("$now")
        } else {
            builder.append(S[i])
        }
    }

    list.add(builder.toString())

    var ans = 0
    var length = 0
    for (str in list) {
        length = max(length, str.length)
    }

    for (str in list) {
        ans += length - str.length
    }

    return ans
}