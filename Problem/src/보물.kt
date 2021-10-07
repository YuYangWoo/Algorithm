fun main() {
    var n = readLine()!!.toInt()
    var newB = ArrayList<Int>()
    var newA = ArrayList<Int>()
    var A = readLine()!!.split(" ").map { it.toInt() }
    var B = readLine()!!.split(" ").map { it.toInt() }
    B.forEach {
        newB.add(it)
    }
    A.forEach { newA.add(it) }
    var newArray = Array(n){0}
   for(i in 0 until n) {
       for(j in 0 until n) {
           if(newB.maxOfOrNull { it } == newB[j]) {
               newArray[j] = newA.minOfOrNull { it }!!
               newB[j] = -1
               newA[newA.indexOf(newA.minOfOrNull { it })] = 101
               break
           }
       }
   }
    var sum =0
    for(i in 0 until n) {
        sum+= (newArray[i] * B[i])
    }
    print(sum)
}