fun main() {
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var hear = ArrayList<String>()
    var see = HashMap<String,Int>()
    var answerList = ArrayList<String>()
    for(i in 0 until N) {
        hear.add(readLine()!!)
    }
    for(i in 0 until M) {
        see[readLine()!!] = 1
    }
    for(i in hear.indices) {
        if(see.containsKey(hear[i])) {
            answerList.add(hear[i])
        }
    }
    println(answerList.size)
    answerList.sort()
    answerList.forEach { println(it) }
}