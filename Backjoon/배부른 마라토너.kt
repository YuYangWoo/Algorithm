fun main() {
    var N = readLine()!!.toInt()
    var answerMap = HashMap<String, Int>()
    for (i in 0 until N) {
        var maratoner = readLine()!!.toString()
        if (answerMap.containsKey(maratoner)) {
            answerMap[maratoner] = answerMap[maratoner]!! + 1
        } else {
            answerMap[maratoner] = 1
        }
    }
    for (i in 0 until N - 1) {
        var winner = readLine()!!.toString()
        if(answerMap.containsKey(winner)) {
            answerMap[winner] = answerMap[winner]!! - 1
        }
    }

    for((k,v) in answerMap) {
        if(v == 1) {
            print(k)
        }
    }
}