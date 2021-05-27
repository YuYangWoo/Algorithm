import java.util.*
import kotlin.collections.ArrayList

fun main() {
    solution(intArrayOf(1,5,2,6,3,7,4), arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3)))
}
fun solution(array: IntArray, commands: Array<IntArray>): ArrayList<Int> {
    var answer = ArrayList<Int>()
    for(i in commands.indices) {
      var slice = array.copyOfRange(commands[i][0] -1, commands[i][1])
        Arrays.sort(slice)
        answer.add(slice[commands[i][2] -1])
    }

    return answer
}