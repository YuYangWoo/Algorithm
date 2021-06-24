import java.util.*

fun main() {
    solution(arrayOf(
        intArrayOf(0,0,0,0,0),
        intArrayOf(0,0,1,0,3),
        intArrayOf(0,2,5,0,1),
        intArrayOf(4,2,4,4,2),
        intArrayOf(3,5,1,3,1)),
        intArrayOf(1,5,3,5,1,2,1,4))
}

// 터트려져 사라진 인형의 개수를 return
fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    var stack = Stack<Int>()
    var compare = -1
    stack.push(0)
    // 00 10 20 30
    for(i in moves) { // 0..4
        for(j in board.indices) { // 0..4
            if(board[j][i-1] != 0) {
                var peek = board[j][i-1]
                compare = stack.peek()
                stack.push(peek)

                if(stack.peek() == compare) {
                    answer += 2
                    stack.pop()
                    stack.pop()
                }
                board[j][i-1] = 0
                break
            }
        }

    }
    print(answer)
    return answer
}