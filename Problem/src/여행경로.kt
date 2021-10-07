import java.util.*

var listss = ArrayList<String>()
var visited = null
fun main() {
    print(solution(arrayOf(arrayOf("ICN", "JFK"),arrayOf("HND", "IAD"),arrayOf("JFK", "HND"))))
}
fun solution(tickets: Array<Array<String>>): Array<String> {
    var answer = arrayOf<String>()
    var adjacent = Array(tickets.size){arrayListOf<String>()}
   var aa = arrayOf("ICN", "SFO", "ATL", "ICN", "ATL", "SFO")
    var bb = arrayOf("ICN","ATL", "ICN", "SFO", "ATL", "SFO")
    aa.sort()
    println(aa.contentToString())
    return answer
}