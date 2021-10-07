import java.lang.StringBuilder

fun main() {
    var n = readLine()!!.toInt()
    var list = Array(n) { "" }
    for (i in 0 until n) {
        list[i] = readLine()!!.toString()
    }
    var compare = list[0]

    var answer = StringBuilder()

    if(n==1) {
        print(list[0])
    }
    else {
        for (i in 0 until n-1) {
            for (j in 0 until list[i].length) {
                if(i == 0) {
                    if (compare[j] == list[i+1][j]) {
                        answer.append(compare[j])
                    }
                    else {
                        answer.append("?")
                    }
                }
                else {
                    if (answer.toString()[j] == list[i+1][j]) {
                        continue
                    }
                    else {
                        answer.deleteCharAt(j)
                        answer.insert(j,"?")
                    }
                }
            }
        }
        print(answer)
    }

}