fun main() {
    val n = readLine()!!.toInt()
    var arr = ArrayList<Long>()
    for (i in 0 until n) {
        arr.add(readLine()!!.toLong())
    }
    arr.sort()
    var tempList = ArrayList<Long>()
    for (i in 0 until arr.size - 1) {
        tempList.add(arr[i + 1] - arr[i])
    }

    var gcd = gcd(tempList[0], tempList[1])
    for (i in 2 until tempList.size) {
        gcd = gcd(gcd, tempList[i])
    }
    var sum = arr[0]
    var count =1
    while(sum != arr[arr.size-1]) {
        sum+=gcd
        count++
    }
    print(count-arr.size)
}

fun gcd(a: Long, b: Long): Long {
    var A = a
    var B = b
    while (B > 0) {
        var tmp = B
        B = A % B
        A = tmp
    }
    return A
}