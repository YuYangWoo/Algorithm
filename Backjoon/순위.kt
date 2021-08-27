fun main() {
    solutionqw(5, arrayOf(intArrayOf(4, 3), intArrayOf(4, 2), intArrayOf(3, 2), intArrayOf(1, 2), intArrayOf(2, 5)))
}

fun solutionqw(n: Int, results: Array<IntArray>): Int {
    val game = Array(n) { IntArray(n) }
    var answer = 0
    for (i in results.indices) {
        game[results[i][0] - 1][results[i][1] - 1] = 1
    }
    for(i in 0 until n) {
        for(j in 0 until n) {
            for(k in 0 until n) {
                if(game[j][i] == 1 && game[i][k] == 1) {
                    game[j][k] = 1
                }
            }
        }
    }
    for (i in 0 until n) {
        var result = 0
        for (j in 0 until n) {
            if (game[i][j] == 1 || game[j][i] == 1) {
                result++
            }
        }
        if (result == n - 1) {
            answer++
        }
    }
    return answer
}