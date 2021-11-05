fun main() {
    val t = readLine()!!.toInt()
    for(i in 0 until t) {
        var N = readLine()!!.toInt()
        var list = readLine()!!.split(" ").map { it.toInt() }
        var arr = ArrayList<Int>()
        var answerList = ArrayList<Int>()
        for(j in list.indices) {
            arr.add((list[j]*0.75).toInt())
        }
        for(j in arr.indices) {
            if(list.contains(arr[j])) {
                answerList.add(arr[j])
            }
        }
        print("Case ${i+1}: ")
        answerList.forEach { print("${it} ") }
        println()
    }
}