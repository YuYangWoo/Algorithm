fun main() {
    var money = readLine()!!.toInt()
    var price = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var bnpCount = 0
    var bnpMoney = money
    var bnpFinal = 0
    var timingFinal = 0
    var timingMoney = money
    var timingCount = 0
    for(i in 0..12) {
        if(bnpMoney >= price[i]) {
            bnpCount += (money / price[i])
            bnpMoney-=(bnpCount * price[i])
            break
        }
    }
    bnpFinal = price[13]*bnpCount + bnpMoney

    // 3일 이상 오르면 다 판다.
    // 3일 이상 내리면 다 판다.
    var buy = 0
    var sell = 0
    for(i in 0..12) {
        var now = price[i]
     if(now < price[i+1]) {
         buy++
         sell = 0
     }
        else if (now > price[i+1]){
            sell--
         buy = 0
     }
        if(buy >= 3 && timingCount != 0) {
            timingMoney += timingCount * price[i+1]
            timingCount = 0
        }
        else if(sell <= -3 && timingMoney/price[i+1] >0) {
            var tmp = timingMoney/price[i+1]
            timingCount += timingMoney/price[i+1]
            timingMoney -= (tmp*price[i+1])
        }
    }
    timingFinal = price[13]* timingCount + timingMoney
    if(bnpFinal > timingFinal) {
        print("BNP")
    }
    else if(bnpFinal < timingFinal) {
        print("TIMING")
    }
    else {
        print("SAMESAME")
    }
}