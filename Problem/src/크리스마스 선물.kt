import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val gift = PriorityQueue(Collections.reverseOrder<Int>())
    for (i in 0 until n) {
        val a = sc.nextInt()
        if (a == 0) {
            if (gift.isEmpty()) println(-1) else println(gift.poll())
        } else {
            for (j in 0 until a) {
                gift.add(sc.nextInt())
            }
        }
    }
    sc.close()
}