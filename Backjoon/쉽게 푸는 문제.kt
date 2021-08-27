fun main() {
    var (A,B) = readLine()!!.split(" ").map { it.toInt()}
    var sum = 0
    var list = ArrayList<Int>()
    for(i in 1..B) {
        for(j in 1..i) {
            list.add(i)
        }
    }
    for(z in A..B) {
        sum += list[z-1]
    }
    print(sum)
}