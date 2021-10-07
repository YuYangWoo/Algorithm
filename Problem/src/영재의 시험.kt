fun main() = with(System.`in`.bufferedReader()) {
    var input = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    dfs(0, input)
    print(answerNum)
}

var log = Array(10) {0}
var answerNum = 0
private fun dfs(index: Int, input:IntArray) {
    if(index == 10) {
        var count = 0
        for(num in log.indices) {
            if(log[num] == input[num]) {
                count++
            }
        }
        if(count >= 5) {
            answerNum++
        }
        return
    }

    for(i in 1..5) {
        log[index] = i
        if(index >=2 &&log[index-1] == log[index-2] && log[index] == log[index-1]) {
            continue
        }
        dfs(index + 1, input)
    }
}