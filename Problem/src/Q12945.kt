fun main() {
    solution(5)
}

fun solution(n: Int): Long {
    var fibonaci = ArrayList<Long>(100000)
    fibonaci.add(0)
    fibonaci.add(1)
    for(i in 2..n) {
        fibonaci.add((fibonaci[i-1] + fibonaci[i-2])%1234567)
    }

    return fibonaci[n]
}