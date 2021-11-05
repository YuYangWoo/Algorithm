fun main() {
    solution(intArrayOf(1,2,7,6,4))
}

fun solution(nums: IntArray): Int {
    var answer = -1
    chkArr = BooleanArray(50) {false}
    nList = Array(3) {0}
    dfszq(nums,0, 0)
    answer = cntt
    return answer
}
lateinit var nList: Array<Int>
lateinit var chkArr: BooleanArray
var cntt = 0
fun dfszq(nums: IntArray, index: Int, start: Int) {
    if(index == 3) {
        //소수 찾기
        sosu(nList.sum())
        return
    }
    for(i in start until nums.size) { // 0123
        if(chkArr[i]) continue
        nList[index] = nums[i]
        chkArr[i] = true
        dfszq(nums, index + 1, i)
        chkArr[i] = false
    }
}
fun sosu(n: Int) {
    var cnt = 0
    for(i in 1..n) {
        if(n%i ==0) {
            cnt++
        }
    }
    if(cnt == 2) {
        cntt++
    }
}