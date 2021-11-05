fun main() {
    val t = readLine()!!.toInt()
    for(i in 0 until t) {
        var N = readLine()!!.toInt()
        var list = readLine()!!.split(" ").map { it.toInt() }
        aList = Array(N) {0}
        inputChkList = BooleanArray(list.size+1) {false}
        chkList = BooleanArray(list.size+1) {false}
        answerListt = Array(N) {0}
        ddffss(N,list,0,0,i)
        print("Case #${i+1}: ")
        answerListt.sort()
        for(j in answerListt.indices) {
            if(j == answerListt.size-1) {
                println(answerListt[j])
            }
            else {
                print("${answerListt[j]} ")
            }
        }

    }

}
fun ddffss(N: Int, list: List<Int>,index: Int, start: Int, num: Int) {
    if(index == N) {
        var cnt = 0
        for(i in aList.indices) {
            for(j in list.indices) {
                if(!inputChkList[j] && (aList[i]*0.75).toInt() == list[j]) {
                    inputChkList[j] = true
                    cnt++
                    break
                }
            }
        }
        if(cnt == N) {
            var z = 0
           for(i in inputChkList.indices) {
               if(inputChkList[i]) {
                   answerListt[z] = list[i].toLong()
                   z++
               }
           }
            inputChkList = BooleanArray(list.size) {false}
        }
        inputChkList = BooleanArray(list.size) {false}

        return
    }
    for(i in start until list.size) {
        if(chkList[i]) continue
        aList[index] = list[i].toLong()
        chkList[i] = true
        ddffss(N, list, index +1, i, num)
        chkList[i] = false
    }
}
lateinit var answerListt: Array<Long>
lateinit var aList: Array<Long>
lateinit var inputChkList: BooleanArray
lateinit var chkList: BooleanArray