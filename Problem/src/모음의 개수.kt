fun main() {
    val input = readLine()!!
    var count = 0
    for(value in input) {
        if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
            count++
        }
    }
    print(count)
}