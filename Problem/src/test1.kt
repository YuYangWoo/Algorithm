//var compare = -1
//var maxLength = -1
//var width = -1
//var realWidth = -1
//
//fun main() {
//    solution(arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8,15), intArrayOf(14,7), intArrayOf(5,15)))
////    solution(arrayOf(intArrayOf(60,50), intArrayOf(30,70), intArrayOf(60,30), intArrayOf(80,40)))
////    solution(arrayOf(intArrayOf(14,4),intArrayOf(19,6),intArrayOf(6,16),intArrayOf(18,7),intArrayOf(7,11)))
//}
//
//fun solution(sizes: Array<IntArray>): Int {
//    // 2차원 배열을 오름차순으로 정렬
//    var oneArray = sizes.sortedWith(Comparator { o1, o2 ->
//        if (o1[0] == o2[0]) {
//            o1[1].compareTo(o2[1])
//        } else {
//            o1[0].compareTo(o2[0])
//        }
//    })
//
//    // 2차원 배열을 내림차순으로 정렬
//    var twoArray = sizes.sortedWith(Comparator { o1, o2 ->
//        if (o1[0] == o2[0]) {
//            o2[1].compareTo(o1[1])
//        } else {
//            o2[0].compareTo(o1[0])
//        }
//    })
//
//    // 오름차순이 가장 큰 수라면(가로)
//    if(oneArray[oneArray.size-1][0] > twoArray[twoArray.size-1][1]) {
//        maxLength = oneArray[oneArray.size - 1][0] // 가로의 최대길이를 삽입
//        compare = 1 // 세로의 길이를 비교하기 위해 1을 삽입(2차원 배열의[][1]이 세로)
//        answer = compareFunc(oneArray)
//    }
//    // 내림차순이 가장 큰 수라면
//    else {
//        maxLength = twoArray[twoArray.size - 1][1]
//        compare = 0
//        answer =compareFunc(twoArray)
//    }
//    print(answer)
//return answer
//}
//
//fun compareFunc(compareArray: List<IntArray>): Int {
//    var answer = 0
//    for (i in compareArray.indices) { // 길이만큼
//        width = maxLength * compareArray[i][compare] // 가로 최대 길이와 세로길이를 곱한것을 width에 삽입
//        var cnt = 0
//        for(j in compareArray.indices) {
//            if(width >= compareArray[j][0]*compareArray[j][1]) { // width가 모든 워너소의 가로*세로보다 크다면 cnt++
//                cnt++
//            }
//        }
//        if(cnt == compareArray.size) { // 같으면
//            if(realWidth > width) { // 최소값을 넣어준다
//                answer = width
//            }
//            realWidth = width // 비교를 위해 with를 삽입
//        }
//
//    }
//    return answer
//}