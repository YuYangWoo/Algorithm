import java.util.*

fun main() {
    val linkedList: Queue<Int> = LinkedList<Int>()

    var hashSet = HashSet<Int>().apply {
        add(5)
        add(8)
        add(9)
        add(3)
        add(1)
    }
    for(i in hashSet) {
        print(i)
    }
}