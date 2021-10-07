fun main() {
    solutionzxc("four5six7")
}
fun solutionzxc(s: String): Int {
    var sb = StringBuilder()
    var answer = StringBuilder()
    for(i in s.indices) {
        sb.append(s[i])

        if(sb.toString() == "zero") {
            answer.append(0)
            sb.clear()
        }
        else if(sb.toString() == "one") {
            answer.append(1)
            sb.clear()
        }
        else if(sb.toString() == "two") {
            answer.append(2)
            sb.clear()
        }
        else if(sb.toString() == "three") {
            answer.append(3)
            sb.clear()
        }
        else if(sb.toString() == "four") {
            answer.append(4)
            sb.clear()
        }
        else if(sb.toString() == "five") {
            answer.append(5)
            sb.clear()
        }
        else if(sb.toString() == "six") {
            answer.append(6)
            sb.clear()
        }
        else if(sb.toString() == "seven") {
            answer.append(7)
            sb.clear()
        }
        else if(sb.toString() == "eight") {
            answer.append(8)
            sb.clear()
        }
        else if(sb.toString() == "nine") {
            answer.append(9)
            sb.clear()
        }

        else if(sb.toString() in "0".."9") {
            answer.append(sb.toString())
            sb.clear()
        }
    }
    return answer.toString().toInt()
}