
fun main() {
    var n = readLine()!!.toInt()
    var list = ArrayList<String>()
    var countList = Array(26) {0}
    for(i in 0 until n) {
        list.add(readLine()!!)
    }
    for(value in list) {
       countList[value[0]-'a']++
    }
    if(countList.count { it>=5 } ==0) {
        print("PREDAJA")
        return
    }
    for(i in countList.indices) {
        if(countList[i] >= 5) {
            print((i+97).toChar())
        }
    }

}