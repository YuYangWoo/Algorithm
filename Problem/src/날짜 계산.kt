fun main() {
    var (E, S, M) = readLine()!!.split(" ").map { it.toInt() }
    var priorE = 1
    var priorS = 1
    var priorM = 1
    var cnt = 1
    if (E == 1 && S == 1 && M == 1) {
        print(1)
    } else {

        while (true) {
            priorE++
            priorS++
            priorM++
            cnt++
            if (priorE == 16) {
                priorE = 1
            }
            if (priorS == 29) {
                priorS = 1
            }
            if (priorM == 20) {
                priorM = 1
            }
            if (priorE == E && priorM == M && priorS == S) {
                break
            }
        }
        print(cnt)
    }


}