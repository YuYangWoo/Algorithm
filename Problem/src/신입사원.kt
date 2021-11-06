fun main()  = with(System.`in`.bufferedReader()){
    var T = readLine()!!.toInt()
    val bw = System.out.bufferedWriter()
    while(T-->0) {
        var n = readLine()!!.toInt()
        var check = BooleanArray(n) {true}
        var arr = ArrayList<Pair<Int,Int>>()
        for(i in 0 until n) {
            var input = readLine()!!.split(" ").map { it.toInt() }
            arr.add(Pair(input[0], input[1]))
        }
        arr.sortBy { it.first }
        var result = 1
        var maxGrade = arr[0].second
        for(i in 1 until arr.size) {
            if(maxGrade > arr[i].second) {
                result++
                maxGrade = arr[i].second
            }
        }
        bw.write("${result}\n")
    }
    bw.close()
}