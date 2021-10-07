import java.lang.Math.min

fun main() {
    print(solutionasd(arrayOf(intArrayOf(60,50),intArrayOf(30,70),intArrayOf(60,30),intArrayOf(80,40))))
}

fun solutionasd(sizes: Array<IntArray>): Int {
    var answer: Int = 0
    var cmp = 0
    for(i in sizes.indices) { // 00 01 10 11 20 21
        for(j in sizes[0].indices) {
            if(cmp < sizes[i][j]) {
                cmp = sizes[i][j]
            }
        }
    }
    var seroo = ArrayList<Int>()
    for(i in sizes.indices) {
        seroo.add(min(sizes[i][0], sizes[i][1]))
    }
    seroo.sort()
    answer = cmp * seroo[seroo.size-1]
    return answer
}