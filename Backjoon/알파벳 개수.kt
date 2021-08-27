fun main() {
    var input = readLine()!!.toString()
    var list = Array<Int>(26){0}
    for(i in input.indices) {
        list[input[i].toInt()-97]++
    }
    list.forEach {
        print("$it ")
    }
}