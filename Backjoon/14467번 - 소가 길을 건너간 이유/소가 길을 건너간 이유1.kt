fun main() {
    var N = readLine()!!.toInt()
    var cowArray = ArrayList<Cow>()
    for(i in 0 until N) {
        var a = readLine()!!.split(" ").map { it.toInt() }
        cowArray.add(Cow(a[0],a[1]))
    }
    cowArray.sortWith(Comparator { o1, o2 ->
        return@Comparator o1.number-o2.number
    })
    var count = 0
    for(i in 0 .. cowArray.size-2) {
        if(cowArray[i].number == cowArray[i+1].number) {
            if(cowArray[i].direction != cowArray[i+1].direction) {
                count++
            }
        }
    }
    print(count)
}
data class Cow(var number:Int = 0, var direction: Int = 0)