import java.util.*

fun main() {
    solutionx(2, 10, intArrayOf(7,4,5,6))
}
fun solutionx(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    // bridge_lenth 다리에 올라갈 수 있는 트럭 수
    // weight 다리가 견딜 수 있는 무게
    // truck_weights 트럭별 무게
    // 다리를 건너는 트럭
    var answer = 0
    val bridgeQueue : Queue<Int> = LinkedList<Int>()
    // 대기 트럭
    val waitQueue : Queue<Int> = LinkedList<Int>()

    // 다리 길이만큼 임의의 숫자 0을 채워줌
    for(i in 0 until bridge_length) bridgeQueue.add(0)
    for(i in truck_weights) waitQueue.add(i)

    // 모두 통과할 때 까지
    while(bridgeQueue.isNotEmpty()){
        answer++
        bridgeQueue.poll()
        if(waitQueue.isNotEmpty()) {
            // 견딜수 있는 무게를 초과하지 않는다면 큐에 삽입
            if (bridgeQueue.sum() <= weight - waitQueue.peek()) {
                bridgeQueue.add(waitQueue.poll())
            } else {
                bridgeQueue.add(0)
            }
        }
    }
    print(answer)
    return answer
}