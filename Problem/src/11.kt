import kotlin.math.min

fun main() {
    print(solution(6,1,1))
}
fun solution(A: Int, B: Int, C: Int): String {
    val answer = StringBuilder()
    var list = listOf(Node('a', A), Node('b', B), Node('c', C))
    while (list.any { it.count > 0 }) {
        list = list.sorted()
        var appended = false
        for (node in list) {
            if (node.count > 0) {
                if (answer.length >= 2 && answer[answer.lastIndex] == node.char && answer[answer.lastIndex - 1] == node.char) {
                    continue
                }

                appended = true
                node.count--
                answer.append(node.char)
                break
            }
        }

        if (!appended) {
            return answer.toString()
        }
    }

    return answer.toString()
}

data class Node(
    val char: Char,
    var count: Int
) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return compareValues(other.count, count)
    }
}