//fun main() {
//
//}
//fun solution(places: Array<Array<String>>): Array<Int> {
//    val answer = IntArray(places.length)
//
//    for (t in 0 until places.length) {
//        val map = places[t]
//        var flag = false
//        for (i in 0..4) {
//            for (j in 0..4) {
//                if (map[i][j] == 'P') {
//                    if (isAroundExistPerson(i, j, map)) {
//                        flag = true
//                        break
//                    }
//                }
//            }
//            if (flag) {
//                answer[t] = 0
//                break
//            }
//        }
//        if (!flag) {
//            answer[t] = 1
//        }
//    }
//
//    return answer
//}
//
//fun isAroundExistPerson(i: Int, j: Int, map: Array<String>): Boolean {
//
//}