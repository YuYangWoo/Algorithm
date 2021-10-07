
import java.util.Collections

import java.util.ArrayList


fun main() {
    s(intArrayOf(3,2,2,3,3,1,4,4))
}
fun s(array: IntArray) {
    var answer = ArrayList<Int>()
    val countingArray= ArrayList(Collections.nCopies(60, 0))
    for(i in array.indices) {
        countingArray[array[i]]++
    }
    println(countingArray)
    for(z in array.indices) {
        if(countingArray[array[z]]!=0 && countingArray[array[z]]!=1) {
            answer.add(countingArray[array[z]])
            countingArray[array[z]] = 0
        }
    }


    print(answer)
}