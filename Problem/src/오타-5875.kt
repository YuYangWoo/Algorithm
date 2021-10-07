import java.util.*

var count = 0

fun main() = with(System.`in`.bufferedReader()) {
    var input = readLine().toString()
    for (i in input.indices) {
        var sb = StringBuilder()
        sb.append(input)
        if (input[i] == '(') {
            sb.deleteCharAt(i)
            sb.insert(i, ")")
        } else if (input[i] == ')') {
            sb.deleteCharAt(i)
            sb.insert(i, "(")
        }
        compareString(sb.toString())
    }
    print(count)
}

fun compareString(input: String) {
    var stack = Stack<Char>()
    var compare = -1
    for(i in input.indices) {
        if(input[i] == '(') {
            stack.push('(')
        }
        else if(input[i] == ')') {
            if(stack.isNotEmpty()) {
                stack.pop()
            }
            else {
                compare = 0
                break
            }
        }
        compare = if(stack.size == 0) {
            1
        } else {
            0
        }
    }
     if(compare == 1) {
         count++
     }

}