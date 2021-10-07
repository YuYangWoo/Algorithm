import java.lang.Integer.sum

fun main() {
    var N = readLine()!!.toInt()
    var list = ArrayList<Pair<Int,Int>>()

    for(i in 0 until N) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        list.add(Pair(input[0], input[1]))
    }
    var answerList = ArrayList<Int>()
    for(i in 0 until N) {
        var rank = 1
        for(j in 0 until N) {
            if(i != j) {
                if(list[i].first < list[j].first && list[i].second < list[j].second) {
                    rank++
                }
            }
        }
        answerList.add(rank)
    }
    answerList.forEach {
        print("$it ")
    }
}