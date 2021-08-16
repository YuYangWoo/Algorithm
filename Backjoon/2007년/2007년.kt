fun main() {
    var input = readLine()!!.toString().split(" ")
    var x = input[0]
    var y = input[1]
    var day = arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    var days = arrayOf("MON", "TUE","WED", "THU", "FRI", "SAT", "SUN")
    var sum = 0
    // 3월 14일은 31+28+14 59 14 73
    for (i in 0 until x.toInt()-1) {
        sum += day[i]
    }
    sum += y.toInt()
    if(sum%7-1 == -1) {
        print("SUN")
    }
    else {
        print(days[sum%7-1])
    }

}