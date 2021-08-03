import kotlin.math.pow

var binary = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    var N = readLine().toString()
    if(N == "0") {
print(0)
    }
    else {

    var stringArray = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")
        var firstArray = arrayOf("", "1", "10", "11", "100", "101", "110", "111")
    for (i in N.indices) {
        if(i == 0) {
            binary.append(firstArray[N[i]-'0'])
        }
        else {
            binary.append(stringArray[N[i]-'0'])
        }
    }

    print(binary.toString())
    }

}
