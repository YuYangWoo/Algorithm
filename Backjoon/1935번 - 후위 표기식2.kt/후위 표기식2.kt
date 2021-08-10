import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var N = readLine()!!.toInt()
    var string = readLine()!!.toString()
    var stringBuilder = ArrayList<String>()
    var numberArray = ArrayList<String>()
    for (i in 1..N) {
        numberArray.add(readLine()!!.toString())
    }

    for (i in string.indices) {
        if (string[i] == '+' || string[i] == '-' || string[i] == '*' || string[i] == '/' || string[i] == '%') {
            stringBuilder.add(string[i].toString())
        } else {
            stringBuilder.add(numberArray[string[i] - 'A'])

        }
    }
    var stack: Stack<Double> = Stack<Double>()
    var completedString = stringBuilder
    var sum = 0.0
    var a = 0.0
    var b = 0.0


    for (i in completedString.indices) {
        if (completedString[i] == "*" || completedString[i] == "/" || completedString[i] == "%") {
            b = stack.pop()
            a = stack.pop()
            when {
                completedString[i] == "*" -> {
                    sum = a * b
                }
                completedString[i] == "/" -> {
                    sum = a / b
                }
                completedString[i] == "%" -> {
                    sum = a % b
                }
            }
            stack.push(sum)
        } else if (completedString[i] == "+" || completedString[i] == "-") {
            b = stack.pop()
            a = stack.pop()
            if (completedString[i] == "+") {
                stack.push((a + b))
            } else if (completedString[i] == "-") {
                stack.push(a - b)
            }
        } else {
            stack.push((completedString[i]).toDouble())
        }
    }
    print("${"%.2f".format(stack.peek())}")

}