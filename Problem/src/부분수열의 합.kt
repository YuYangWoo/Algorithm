fun main() {
    val (N, S) = readLine()!!.split(" ").map { it.toInt() }
    val input = readLine()!!.split(" ").map { it.toInt() }
    checkArrayyy = BooleanArray(N) { false }
    countList = Array(N) { 0 }
    for (i in 1..N) {
        dffs(input, S, 0, i, 0)
    }
    print(countz)
}

var countz = 0
lateinit var checkArrayyy: BooleanArray
lateinit var countList: Array<Int>

fun dffs(input: List<Int>, S: Int, index: Int, pick: Int, start: Int) {
    if (index == pick) {
        if (countList.sum() == S) {
            countz++
        }
        return
    }
    for (i in start until input.size) {
        if (checkArrayyy[i]) continue
        countList[index] = input[i]
        checkArrayyy[i] = true
        dffs(input, S, index + 1, pick, i)
        checkArrayyy[i] = false
    }

}