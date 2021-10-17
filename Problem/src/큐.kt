import java.util.*
import kotlin.collections.ArrayList

fun main() = with(System.`in`.bufferedReader()){
    val N = readLine()!!.toInt()
    val bw = System.out.bufferedWriter()
    var command = ArrayList<String>()
    for(i in 0 until N) {
        command.add(readLine()!!)
    }
    var queue: Queue<Int> = LinkedList()
    for(i in command.indices) {
        when(command[i]) {
            "front" -> {
                if(queue.isNotEmpty()) {
                    bw.write("${queue.first()}\n")
                } else bw.write("${-1}\n")
            }
            "back" -> {
                if(queue.isNotEmpty()) {
                    bw.write("${queue.last()}\n")
                } else bw.write("${-1}\n")
            }
            "size" -> {
                bw.write("${queue.size}\n")
            }
            "empty" -> {
                if(queue.isEmpty()) {
                    bw.write("1\n")
                }
                else {
                    bw.write("0\n")
                }
            }
            "pop" -> {
                if(queue.isNotEmpty()) {
                    bw.write("${queue.poll()}\n")
                } else bw.write("${-1}\n")
            }
            else -> {
                var arr = command[i].split(" ")
                if(arr[0] == "push") {
                    queue.add(arr[1].toInt())
                }
            }
        }
    }
    bw.close()
}