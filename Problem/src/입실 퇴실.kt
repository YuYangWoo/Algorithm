import java.util.*

fun main() {
    print(solution(intArrayOf(1,3,2), intArrayOf(1,2,3)))
}
fun solution(enter: IntArray, leave: IntArray): ArrayList<Int> {
    var answer = ArrayList<Int>()
    var countingArray = Array(enter.size+1){0}
    var queue: Queue<Int> =LinkedList<Int>()
    leave.forEach {
        queue.add(it)
    }
    var stack = Stack<Int>()
    for(i in enter.indices) {
        for(z in stack.indices) {
            countingArray[stack[z]]++ // 스택안에
            countingArray[enter[i]]++ // 방금 들어온애
        }
        stack.add(enter[i])
            if(stack.peek() == queue.peek()) {
                stack.remove(queue.peek())
                queue.poll()
            }
        while(true) {
            if(stack.contains(queue.peek())) {
                stack.remove(queue.peek())
                queue.poll()
            }
            else {
                break
            }
        }

    }
    for(i in 1 .. enter.size) {
        answer.add(countingArray[i])
    }
    return answer
}