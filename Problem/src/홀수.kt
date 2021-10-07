fun main() {
    var list = ArrayList<Int>()
    for(i in 0..6) {
        list.add(readLine()!!.toInt())
    }
    var answer = 0
    list.sort()
    for(i in list.indices) {
        if(list[i]%2 == 1) {
            answer = list[i]
            break
        }
    }
    var sum = 0
    for(i in list.indices) {
        if(list[i]%2 == 1) {
            sum+=list[i]
        }
    }
    if(sum == 0 && answer == 0) {
        print(-1)
    }
    else {
        println(sum)
        println(answer)
    }
}