import java.util.*
import kotlin.collections.ArrayList

    fun main() {
        solutions(intArrayOf(2,1,3,4,1))
    }

    fun solutions(numbers: IntArray): List<Int> {
        var answer = ArrayList<Int>()
        for(i in numbers.indices) {
            for(j in i+1 until numbers.size) {
                answer.add(numbers[i]+numbers[j])
            }
        }

        return answer.distinct().sorted()
    }
