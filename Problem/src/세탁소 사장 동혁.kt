fun main() {
    val t = readLine()!!.toInt()
    for(i in 0 until t) {
        var money = readLine()!!.toInt()
        var cnt = intArrayOf(0,0,0,0)
        var sum = money
        while(sum >0) {
            if(sum >= 25) {
                sum-=25
                cnt[0]++
            }
            else if(sum >=10) {
                sum-=10
                cnt[1]++
            }
            else if(sum >= 5) {
                sum-=5
                cnt[2]++
            }
            else if(sum >= 1) {
                sum-=1
                cnt[3]++
            }
        }
        cnt.forEach { print("${it} ") }
        println()
    }
}