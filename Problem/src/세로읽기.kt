fun main() {
    var array = Array(5){arrayListOf<String>()}
    var count = Integer.MIN_VALUE
    for(i in 0..4) {
        val input = readLine()!!
        count = count.coerceAtLeast(input.length)
        for(j in input.indices) {
            array[i].add(input[j].toString())
        }
    }

    for(i in 0..4) {
        if(array[i].size < count) {
            for(j in 0 until count-array[i].size) {
                array[i].add("")
            }
        }
    }
    var z = 0
    for(i in 0 until array[z].size) {
        for(j in 0..4) {
            if(array[j][i] == "")continue
            if(array[j][i] in "a".."z" || array[j][i] in "A".."Z" || array[j][i] in "0".."9") {
                print(array[j][i])
            }
        }
        z++
    }
}