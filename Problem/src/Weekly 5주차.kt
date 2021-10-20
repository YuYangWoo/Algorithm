fun main() {
    solutionzxzz("I")
}
fun solutionzxzz(word: String): Int {
    var answer = 0
    var sb = arrayOf("","","","","")
    var arr = arrayOf("A","E","I","O","U")
    dfs(0, word, sb,arr)
    answer = answerz
    print(answer)
    return answer
}
var counta = 0
var answerz = 0
fun dfs(index: Int, word: String, sb: Array<String>, arr: Array<String>) {
    var stringBuilder = StringBuilder()
    for(i in sb.indices) {
        stringBuilder.append(sb[i])
    }
    if(stringBuilder.toString() == word) {
        answerz = counta
        return
    }
    println(stringBuilder.toString() + "스트링빌더")
    if(index == 5) {
        if(sb[index-1] == "U") {
            sb[index-1] = ""
            if(sb[index-2] == "U") {
                sb[index-2] = ""
                if(sb[index-3] == "U") {
                    sb[index-3] = ""
                    if(sb[index-4] == "U") {
                        sb[index-4] = ""
                    }
                }
            }
        }
        return
    }

    for(i in arr.indices) {
        sb[index] = arr[i]
        println(sb.contentDeepToString())
        counta++
        dfs(index +1,word, sb, arr)
    }
}