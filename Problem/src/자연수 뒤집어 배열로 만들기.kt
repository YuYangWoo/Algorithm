class Solution {
    fun solution(n: Long): ArrayList<Int> {
        var answer = ArrayList<Int>()
        var string = n.toString()
        string = string.reversed()
        string.forEach {
            answer.add(it-'0')
        }
        var a = ArrayList<Int>()
        a.sortedDescending()
        print(answer)
        return answer
    }
}