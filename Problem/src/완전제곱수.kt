fun main() {
    var M = readLine()!!.toInt()
    var N = readLine()!!.toInt()
    var powList = ArrayList<Int>()
    var sum = 0
    var min = 0
    for(i in 1..10000) {
        powList.add(i*i)
    }
    var flag = false
    for(i in powList.indices) {
        if(powList[i] in M..N) {
            if(!flag){
                min = powList[i]
                flag = true
            }
            sum += powList[i]
        }
    }
    if(!flag) {
        print("-1")
    }
    else {
        println(sum)
        print(min)
    }

}