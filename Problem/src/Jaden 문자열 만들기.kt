fun main() {
    solutionqaz("Far")
}
fun solutionqaz(s: String): String {
    var answer = ""
    var list = s.split(" ")
    var sb = StringBuilder()
    for(i in list.indices) {
        var input = list[i]
        for(j in input.indices) {
            if(j == 0 && input[j] in 'a'..'z') { //소문자이면 대문자로
                sb.append((input[j].toInt()-32).toChar().toString()) //f
            }
            else {
                if(j !=0 && input[j] in 'A'..'Z') { // 나머지 대문자면 소문자로 하고 그대로
                    sb.append((input[j].toInt()+32).toChar().toString())
                } else {
                    sb.append(input[j])

                }
            }
        }
        sb.append(" ")
    }
    sb.deleteCharAt(sb.lastIndex)
    answer = sb.toString()
    print(answer)
    return answer
}