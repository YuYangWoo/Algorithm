fun main() {
    solutionazq(intArrayOf(2,3,4))
}
fun solutionazq(arr: IntArray): Int {
    var answer = arr[0]
    if(arr.size == 1) {
        answer = arr[0]
        return answer
    }
    arr.sort()

    for(i in 1 until arr.size) {
       var gcd = gcdd(answer,arr[i])
        answer *= arr[i] / gcd
    }

    print(answer)
    return answer
}

fun gcdd(a: Int, b:Int): Int {
    var A = a
    var B = b
    while(B >0) {
        var tmp = B
        B = A%B
        A = tmp
    }
    return A
}