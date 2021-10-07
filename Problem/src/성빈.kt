fun main() {
page2("+", 8,7)



}

fun page2(operator: String, a:Int, b:Int) {

    operator(operator, a, b)
}
fun operator(operator: String, a:Int, b:Int) {
    when (operator) {
        "+" -> {
            print(a+b)
        }
        "-" -> {
            print(a-b)
        }
        "*" -> {
            print(a*b)
        }
        "/" -> {
            print(a/b)
        }
        "%" -> {
            print(a%b)
        }
    }
}