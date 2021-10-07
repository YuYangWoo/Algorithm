fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine()!!.toInt()
    val arr = Array(N) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }

    var arrayList = ArrayList<Int>()

    for(i in  1 .. N) {
        var count = 0
        var day = i
       while(true) {
      if(day >= N+1) {
          break
      }
           count += arr[day-1][1]
           day += arr[day-1][0]

       }
        arrayList.add(count)

    }
    arrayList.sorted().reversed()
    print(arrayList[0])

}