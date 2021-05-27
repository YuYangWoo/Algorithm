import java.util.*
import kotlin.math.max

fun main() {
        solution(intArrayOf(1,2,3,4,5,6,7,8))
    }

    fun solution(answers: IntArray): ArrayList<Int> {
        var answer = ArrayList<Int>()
        var A = intArrayOf(1,2,3,4,5)
        var B = intArrayOf(2,1,2,3,2,4,2,5)
        var C = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        var cnt = intArrayOf(0,0,0)

        for(i in answers.indices) {
            if(answers[i] == A[i%5]) {
                cnt[0]++
            }
            if(answers[i] == B[i%8]) {
                cnt[1]++
            }
            if(answers[i] == C[i%10]) {
                cnt[2]++
            }
        }
        var max = max(max(cnt[0], cnt[1]), cnt[2])

        for(i in cnt.indices) {
            var a = i
            if(max == cnt[i]) {
                answer.add(a+1)
            }
        }

        return answer
    }

