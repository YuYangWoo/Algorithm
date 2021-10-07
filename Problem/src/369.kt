fun main() {
    var N = readLine()!!.toInt()
    var sum = 0
    for(i in 1..N) {
        var word = i.toString()
        for(j in word.indices) {
            if(word[j].toString().toInt() == 3 || word[j].toString().toInt() == 6 || word[j].toString().toInt() == 9) {
                sum++
            }
        }
    }
    print(sum)
}