import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var string = readLine()!!.toString()
    var stringBuilder = StringBuilder()
    var stack = Stack<String>()
    var s = stringBuilder.toString()

    for(z in string.indices) {
        var int = 1
        when {
            string[z] == '(' -> {
                stack.push("(")

            }
            string[z] == '[' -> {
                stack.push("[")

            }
            string[z] == ')' -> {
                if(stack.isNotEmpty() && stack.peek()[0].toString() in "0".."9") {
                    int = stack.pop().toInt()
                }
                if(stack.isNotEmpty() && stack.peek() == "(") {
                    stack.pop()
                    if(stack.isNotEmpty() && stack.peek()[0].toString() in "0".."9") {
                        stack.add((((stack.pop().toInt()) + (2*int)).toString()))
                    }
                    else {
                        stack.add(((2*int).toString()))
                    }
                }
                else {
                    stack.add(string[z].toString())
                }
            }
            string[z] == ']' -> {
                if(stack.isNotEmpty() && stack.peek()[0].toString() in "0".."9") {
                    int = stack.pop().toInt()
                }
                if(stack.isNotEmpty() && stack.peek() == "[") {
                    stack.pop()
                    if(stack.isNotEmpty() && stack.peek()[0].toString() in "0".."9") {
                        stack.add((stack.pop().toInt() + (3*int)).toString())
                    }
                    else {
                        stack.add(((3*int).toString()))
                    }
                }
                else {
                    stack.add(string[z].toString())
                }
            }
            else -> {
//                stack.push(s[z].toString())
                print("0")
                return
            }
        }
    }

    if(stack.peek()[0].toString() in "0".."9" && stack.size==1) {
        print(stack.peek())
    }
    else {
        print("0")
    }
}