fun main() {
print(solution(arrayOf(
    intArrayOf(50,90),
    intArrayOf(50,87),
    )))
}
fun solution(scores: Array<IntArray>): String {
    var answer: String = ""

    for(i in scores.indices) {
        var scoreList = ArrayList<Int>()
        for(j in scores[i].indices) {
            scoreList.add(scores[j][i])
        }
        answer += if(scoreList[i] == scoreList.maxOrNull() && scoreList.count { it==scoreList.maxOrNull() } == 1) { // 유일하고 최대값일 때
            grade(((scoreList.sum()-scoreList[i])/(scoreList.size-1)).toDouble())
        } else if(scoreList[i] == scoreList.minOrNull() && scoreList.count { it==scoreList.minOrNull() } == 1) {
            grade(((scoreList.sum()-scoreList[i])/(scoreList.size-1)).toDouble())
        } else {
            grade((scoreList.sum()/scoreList.size).toDouble())
        }
    }
    return answer
}
fun grade(grade: Double): String {
    return if(grade >= 90) {
        "A"
    }
    else if(grade >=80 && grade<90) {
        "B"
    }
    else if(grade >=70 && grade<80) {
        "C"
    }
    else if(grade>=50 && grade<70) {
        "D"
    }
    else {
        "F"
    }
}