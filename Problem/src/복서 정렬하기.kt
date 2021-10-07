import java.io.Serializable

fun main() {
    solution(intArrayOf(50,82,75,120), arrayOf("NLWL","WNLL","LWNW","WWLN"))
}
fun solution(weights: IntArray, head2head: Array<String>): ArrayList<Int> {
    var answer = ArrayList<Int>()
    var list = Array<information>(weights.size){ information() } // 승률 복서이긴횟수 몸무게

    for(i in head2head.indices) {
        var stadium = head2head[i]
        list[i].weight = weights[i]
        list[i].number = i
        var winCnt = 0
        var lostCnt = 0
        for(j in stadium.indices) {
            if(stadium[j] == 'W') {
                winCnt++
                if(weights[i] <weights[j]) {
                    list[i].winCount++
                }
            }
            else if(stadium[j] == 'L') {
                lostCnt++
            }
        }
        if(winCnt == 0 && lostCnt == 0) {
            list[i].count = 0.0
        }
        else {
            list[i].count = (winCnt.toDouble()/(winCnt.toDouble()+lostCnt.toDouble()))
        }

    }

   list.sortedWith(compareByDescending(information::count).thenByDescending(information::winCount).thenByDescending(information::weight).thenBy(information::number))
    list.forEach { println(it) }
// for(i in list1.indices) {
//     answer.add(list1[i].number +1)
//
// }
    return answer
}
data class information (var count: Double = 0.0, var winCount: Int = 0, var weight: Int = 0, var number: Int = 0)