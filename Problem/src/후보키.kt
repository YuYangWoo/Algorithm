fun main() {
    print(
        solutionzxcv(
            arrayOf(
                arrayOf("100", "ryan", "music", "2"),
                arrayOf("200", "apeach", "math", "2"),
                arrayOf("300", "tube", "computer", "3"),
                arrayOf("400", "con", "computer", "4"),
                arrayOf("500", "muzi", "music", "3"),
                arrayOf("600", "apeach", "music", "2")
            )
        )
    )
}

fun solutionzxcv(relation: Array<Array<String>>): Int {
    var keys = arrayListOf<Int>()
    val len = relation[0].size

    loop@ for (bit in 1 until (1 shl len)) {

        // 최소성 판별
        for (key in keys) {
            if (bit and key == key) {
                continue@loop
            }
        }

        var set = HashSet<String>()
        for (info in relation) {
            val sb = StringBuilder()
            for (k in 0 until len) {
                if (bit and (1 shl k) != 0) {
                    sb.append(info[k])
                }
            }
            val key = sb.toString()
            if (set.contains(key)) {
                continue@loop
            } else {
                set.add(key)
            }
        }
        keys.add(bit)
    }

    return keys.size
}



