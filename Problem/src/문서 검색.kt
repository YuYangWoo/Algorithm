fun main() {
    val document = readLine()!!
    var findWord = readLine()!!
    var i = 0
    var cnt = 0
    while(true) {

        var z = 0
        var sb = StringBuilder()
        var count = findWord.length
        for(j in i until document.length) {
            if(count == 0) {
                break
            }
            sb.append(document[j])
            z=j
            count--
        }
        if(sb.toString().length < findWord.length) {
            break
        }
        if(sb.toString() == findWord) {
            i=z+1
            cnt++
        }
        else {
            i++
        }
    }
    print(cnt)

}