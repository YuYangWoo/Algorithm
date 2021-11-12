import java.util.*

fun main() {
    while(true) {
        val input = readLine()!!
        var answer = "yes"
        var small = Stack<String>()
        if(input == ".") {
            break
        }
        for(i in input.indices) {
            if(input[i] == '(') {
                small.add("(")
            }
            else if(input[i] == '[') {
                small.add("[")
            }
            if(input[i] == ')') {
                if(small.isNotEmpty()) {
                    var content = small.pop()
                    if(content != "(") {
                        answer = "no"
                        break
                    }
                } else {
                    answer = "no"
                    break
                }

            } else if(input[i] == ']') {
                if(small.isNotEmpty()) {
                    var content = small.pop()
                    if(content != "[") {
                        answer = "no"
                        break
                    }
                } else {
                    answer = "no"
                    break
                }

            }
        }
        if(small.isNotEmpty()) {
            answer = "no"
        }
        println(answer)
    }
}