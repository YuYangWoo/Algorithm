import java.util.*

fun main() {
    var stack = Stack<Char>()
    val input = readLine()!!
    var height = 0
    for(i in input.indices) {
        if(i == 0) {
            height+=10
            stack.add(input[i])
        }
        else {
            val cmp = stack.pop()
            if(cmp != input[i]) {
                height+=10
                stack.add(input[i])
            }else {
                height+=5
                stack.add(input[i])
            }
        }
    }
    print(height)
}