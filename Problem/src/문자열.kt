
fun main() {
    var input = readLine()!!.split(" ").map { it.toString() }
    var A = input[0]
    var B = input[1]
    var min = ArrayList<Int>()
    for(i in 0.. B.length - A.length) {
        var cnt = 0
        for(j in A.indices) {
            if(j+i < B.length && A[j] != B[j+i]) {
               cnt++
            }
        }
        min.add(cnt)
    }
    print(min.minOrNull())
}