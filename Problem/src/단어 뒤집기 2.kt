fun main() {
    var sb = StringBuilder()
    val input = readLine()!!
    var flag = false
    var arr = ArrayList<String>()
    var i = 0
    var j = 0
    while(i < input.length) {
        if(input[i] == '>') {
            sb.append(">")
            j = i
            var sb1 = StringBuilder()
            while(true) {
                if(j+1 >=input.length || input[j+1] =='<') break
                sb1.append(input[j+1])
                j++
            }
            sb.append(sb1.toString().reversed())
            i=j+1
        }else {
            sb.append(input[i])
            i++
        }

    }
    print(sb.toString())
}