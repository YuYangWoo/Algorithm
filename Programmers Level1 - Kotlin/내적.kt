
    fun main() {
        solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2))
    }

    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        for(i in a.indices) {
            answer +=(a[i]*b[i])
        }
        println(answer)
        return answer
    }
