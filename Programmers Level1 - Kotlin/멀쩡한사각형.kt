fun main() {

    solution(intArrayOf(44,1,0,0,31,25), intArrayOf(31,10,45,1,6,19))
}
fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    var sum = 0; // 0을 제외하고 당첨 번호가 몇개 있는지
    var zero = 0; // 0이 몇개 있는지
    for( i in lottos.indices) {
        if(lottos[i] == 0) { // 0의 개수를 구한다.
            zero += 1 // 2
        }
       for(j in win_nums.indices) { // 당첨번호 개수를 구한다.
           if(lottos[i] == win_nums[j]) {
               sum += 1 // 2
           }
       }
    }
    var answer = intArrayOf(sum+zero, sum) // 배열에 넣고
    for(i in answer.indices) { // 순위를 매긴다.
        when {
            answer[i] == 6 -> {
                answer[i] = 1
            }
            answer[i] == 5 -> {
                answer[i] =2
            }
            answer[i] == 4 -> {
                answer[i] = 3
            }
            answer[i] == 3 -> {
                answer[i] = 4
            }
            answer[i] ==2 -> {
                answer[i] =5
            }
            else -> {
                answer[i] = 6
            }
        }
    }

    return answer
}