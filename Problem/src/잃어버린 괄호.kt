fun main() {
    val input = readLine()!!
    var stringList = input.split("-")
    var ans = Integer.MAX_VALUE
    for (i in stringList.indices) {
        var plusList = stringList[i].split("+")
        var sum = 0

        for (j in plusList.indices) {
            sum += plusList[j].toInt()
        }

        if(ans == Integer.MAX_VALUE) {
            ans = sum
        } else {
            ans-=sum
        }

    }

    print(ans)
}