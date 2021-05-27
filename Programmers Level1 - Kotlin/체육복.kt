fun main() {
    solution(5, intArrayOf(1,2,3), intArrayOf(2,3,4))
}
fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = 0
    var temp = IntArray(n) {1}
    for (element in reserve) {
        temp[element - 1]++;
    }
    for (element in lost) {
        temp[element - 1]--;
    }
    for (i in temp.indices) {
        if (temp[i] == 0 && i != 0 &&(temp[i - 1] > 1)) {
            temp[i]++; temp[i - 1]--;
        }

        else if (temp[i] == 0 && i != (temp.size-1) &&(temp[i + 1] > 1))
        {
            if ((i + 1) != temp.size) {
                temp[i]++; temp[i + 1]--;
            }
        }
    }


    for (element in temp) {
        if (element >= 1) {
            answer++;
        }
    }
    println(answer)
    return answer
}