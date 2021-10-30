fun main() {
    val list = Array(5) { arrayListOf<Int>()}
    for(i in 0..4) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        for(j in input.indices) {
            list[i].add(input[j])
        }
    }
    val sumList = ArrayList<Int>()
    for(i in 0..4) {
        sumList.add(list[i].sum())
    }
    for(i in 0..4) {
        if(sumList.maxOrNull() == sumList[i]) {
            print("${i+1} ${sumList.maxOrNull()}")
        }
    }
}