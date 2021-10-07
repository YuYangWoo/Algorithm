
fun main() {
    var T = readLine()!!.toInt()
    for(i in 0 until T) {
        var(a,b) = readLine()!!.split(" ").map { it.toInt() }
        var sum=1

            for(j in 0 until b) {
                sum = sum*a%10
            }
            if(sum == 0) {
                println("10")
            }
            else {
                println(sum)
            }
    }
}