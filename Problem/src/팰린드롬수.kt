fun main() {
    while(true) {
        val input = readLine()!!
        if(input == "0") {
            break
        }
        var cmp = input.reversed()
        if(input == cmp) {
            println("yes")
        }
        else {
            println("no")
        }
    }
}