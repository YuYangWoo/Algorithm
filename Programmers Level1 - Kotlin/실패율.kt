import java.util.*
import kotlin.collections.ArrayList

fun main() {
    solution(5, intArrayOf(2,1,2,4,2,4,3,3))
}

fun solution(N: Int, stages: IntArray): ArrayList<Int>{
    var answer = DoubleArray(N) {0.0}
    var people = stages.size *1.0
    for (i in stages) {
        if(i <= N) {
            answer[i-1]++ //0 1 3 2 1 0 1
        }
    }
    for (i in answer.indices) {
        if(answer[i] == 0.0) {
            answer[i] = 0.0
        }
        else {
            var temp = answer[i]
            answer[i] = answer[i]/people
            people -= temp
        }

    }

    var copy = ArrayList<Double>()
    var newAnswer = ArrayList<Int>()

    for(i in answer) {
        copy.add(i)
    }
    copy.sort()

    for(i in copy.size-1 downTo 0) {
       for(j in answer.indices) {
           if(copy[i] == answer[j]) {
               newAnswer.add(j+1)
               answer[j]=-1.0
               break
           }
       }
    }
    newAnswer.forEach {
        println(it)
    }
    return newAnswer
}