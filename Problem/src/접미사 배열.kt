fun main() {
    var S = readLine()!!
    var list = ArrayList<String>()

    var cnt = 0
    while(true) {
        if(cnt == S.length) break
        var sb = StringBuilder()
        for(i in cnt until S.length) {
            sb.append(S[i])
        }
        list.add(sb.toString())
        cnt++
    }
    list.sort()
    list.forEach {
        println(it)
    }
}