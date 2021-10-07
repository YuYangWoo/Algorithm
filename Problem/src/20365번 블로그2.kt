import java.lang.Integer.min
import java.lang.StringBuilder

fun main() = with(System.`in`.bufferedReader()) {
    var N = readLine()!!.toInt()
    var input = readLine().toString()
    var r = 0
    var b = 0
    var i = 0
if(input.length == 1) {
    print(1)
    return
}
    else {

    while (i < input.length - 1) {
        if (input[i] != input[i + 1]) {
            if(input[i + 1] == 'R') b++;
            else r++;
        }
        i++
    }
    if (input[i-1] != input[i]) {
        if(input[i] == 'R') r++;
        else b++;
    }
    else {
        if(input[i] == 'R') {
            r++
        }
        else {
            b++
        }
    }
    print(min(r,b) + 1)
}
}