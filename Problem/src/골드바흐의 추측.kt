import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var prime = Array(1000001) { true }
    prime[0] = false
    prime[1] = false
    for (i in 2..1000000) {
        if (prime[i]) {
            for (j in 2 * i..1000000 step i) {
                prime[j] = false
            }
        }
    }
    var sosu = ArrayList<Int>()
    for(i in 2..1000000) {
        if(prime[i]) {
            sosu.add(i)
        }
    }

    while (true) {
        var input = readLine()!!.toInt()
        if (input == 0) {
            break
        }
        var flag = false
        for(i in sosu.indices) {
            if(prime[input - sosu[i]]) {
                println("$input = ${sosu[i]} + ${input-sosu[i]}")
                flag = true
                break
            }
        }
        if(!flag) println("Goldbach's conjecture is wrong.")
    }
}