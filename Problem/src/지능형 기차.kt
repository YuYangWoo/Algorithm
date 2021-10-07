fun main() {
    var list = ArrayList<Pair<Int,Int>>()
    for(i in 0..3) {
        var input = readLine()!!.split(" ").map { it.toInt() }
        list.add(Pair(input[0], input[1]))
    }
    var max = list[0].second
    var sum = max
    for(i in 1..3) {
       sum = sum-list[i].first+list[i].second
        if(max < sum) {
            max = sum
        }
    }
    print(max)
}