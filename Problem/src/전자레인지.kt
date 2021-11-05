fun main() {
    val t = readLine()!!.toInt()
    var arr = intArrayOf(300,60,10)
    var sum = t
    var cnt = intArrayOf(0,0,0)
    while(sum >=10) {
        if(sum>=300) {
            cnt[0]++
            sum-=300
        }
        else if(sum>=60) {
            cnt[1]++
            sum -= 60
        }
        else if(sum>=10) {
            cnt[2]++
            sum -= 10
        }

    }
    if(sum == 0) {
        cnt.forEach { print("${it} ") }
    }  else {
        print(-1)
    }
}