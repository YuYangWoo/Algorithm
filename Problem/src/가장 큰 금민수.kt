fun main() {

    var N = readLine()!!.toInt()
    while (true) {
        var cnt = 0
        var c = N.toString()
        for(i in c.indices) {
            if(Character.getNumericValue(c[i]) == 7) {
                cnt++
            }
            else if(Character.getNumericValue(c[i]) == 4) {
                cnt++
            }
        }
        if(c.length == cnt) {
            print(c)
            break
        }
        N--
    }
}