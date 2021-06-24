import kotlin.math.abs

class 음양더하기 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for(i in signs.indices) { // 배열크기를 구하고 양수이면 그냥 더하기 음수이면 -1곱하고 더하기
            answer += when(signs[i]) {
                true -> {
                    absolutes[i]
                }
                false -> {
                    (absolutes[i] * -1)
                }
            }
        }
        return answer
    }
}