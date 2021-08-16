fun main() {
    var N = readLine()!!.toInt()
    var array = Array<String>(N) { "" }
    var cnt = 0
    for (i in 0 until N) {
        array[i] = readLine()!!.toString()
    }
    for (i in array.indices) {
        var visit = Array<Boolean>(26) { false }
        if (check(array[i], visit)) {
            cnt++
        }
    }
    print(cnt)

}

fun check(input: String, visit: Array<Boolean>): Boolean {
    var prev: Char = ']'
    for (i in input.indices) { // happy
        var now = input[i]
        if (prev != now) {
            if (visit[now-'a']) {
                return false
            }
            prev = now
            visit[now.toInt() - 97] = true

        } else {
            continue
        }

    }
    return true
}