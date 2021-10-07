var counttt = 0
fun main() {
    print(solutionzx(intArrayOf(1,1,1,1,1), 3))
}
fun solutionzx(numbers: IntArray, target: Int): Int {

    dfs(numbers[0],target, numbers, 0)
    dfs(numbers[0] * -1, target, numbers, 0)
    return counttt
}

fun dfs(start: Int, target: Int, numbers:IntArray, depth: Int) {
    if(depth == numbers.size-1) {
        if(start == target) {
            counttt++
        }
        return
    }
        dfs(start + numbers[depth +1], target, numbers, depth+1)
        dfs(start - numbers[depth + 1], target, numbers, depth+1)

}
