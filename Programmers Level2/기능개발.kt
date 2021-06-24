fun main() {
    solutions(intArrayOf(99,99,99), intArrayOf(1,1,1))
}
fun solutions(progresses: IntArray, speeds: IntArray): ArrayList<Int> {
    var answer = ArrayList<Int>()
    var cnt = IntArray(speeds.size){0}
    for(i in progresses.indices) {
        while(progresses[i] < 100) {
            progresses[i] = progresses[i] + speeds[i]
            cnt[i]++
        }
    }
    var max = cnt[0]
    var count = 0
    for(i in 1 until cnt.size) {
        if(max >= cnt[i]) {
            count++
        }
        else {
            answer.add(count+1)
            max = cnt[i]
            count=0
        }
    }
    answer.add(++count)
    answer.forEach {
        println(it)
    }
    return answer
}