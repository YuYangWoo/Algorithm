fun main() {
    var string = readLine()!!
    var count = 1
    for(i in string.indices) {
        if(count % 10 == 0) {
            println(string[i])
        } else {
            print(string[i])
        }
        count++
    }
}