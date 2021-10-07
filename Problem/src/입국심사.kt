fun main() {
print(binarySearch(arrayListOf<Int>(7,10),6))
}

fun binarySearch(times:ArrayList<Int>, target: Long): Long {
    times.sort()
    var low = 0L
    var high: Long = target * times[times.size-1]
    var answer: Long = target * times[times.size-1]
    var mid = 0L
    while (low <= high) {
        var cnt = 0L
        mid = (low + high) / 2
        for(i in times.indices) {
            cnt += mid/times[i]
        }

        when {
            cnt >= target -> {
                if(answer > mid) {
                    answer = mid
                }
                high = mid - 1
            }
            else -> low = mid + 1
        }
    }
    return answer
}