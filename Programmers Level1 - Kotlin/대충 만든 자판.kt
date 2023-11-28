fun main() {
    solution(arrayOf("AA"), arrayOf("B"))
}

fun solution(keymap: Array<String>, targets: Array<String>): ArrayList<Int> {
    return findLowestCount(keymap, targets)
}

fun findLowestCount(keymap: Array<String>, targets: Array<String>): ArrayList<Int> {
    val a = arrayListOf<Int>()
    targets.forEachIndexed { index, target ->
        val countList = ArrayList<Int>()

        target.forEach { element ->
            var minValue = arrayListOf<Int>()
            keymap.forEach { item ->
                item.indexOf(element.toString()).also {
                    minValue.add(it + 1)
                }
            } // 2 -1
            if (minValue.count { it == 0 } == minValue.size) countList.add(-1)
            else countList.add(minValue.filter {it > 0}.sorted()[0])
        }
        a.add(countList.sum())
    }
    return a
}
