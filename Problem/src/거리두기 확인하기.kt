

fun main() {
    print(solutionvv(arrayOf(
        arrayOf("OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"),
        arrayOf("POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"),
        arrayOf("POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"),
        arrayOf("PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"),
        arrayOf("PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"),
)))
}

// String 배열 정리하기.
fun solutionvv(places: Array<Array<String>>): Array<Int> {
    var answer = ArrayList<Int>()
    var visit = Array(places.size) {0}
    for(i in places.indices) {
       var map = places[i]
        var flag = false
        for(k in places.indices) {
            for(y in places[0].indices) {
                if(map[k][y] == 'P') {

                    // 위 k-1,y 아래 k+1,y 왼 k, y-1 오른 k, y+1 오대 k-1,y+1 왼대 k-1,y-1 왼대아 k+1,y-1 오른아 k+1, y+1
                    // 맨허튼거리가 2이하이고 파레트가없으면
                    if(around(k, y, map)) {
                       flag = true
                    }

                }
            }

        }
        if(flag) {
            visit[i] = 0
        }
        else {
            visit[i] = 1
        }
    }
    print(visit.contentDeepToString())
    return visit
}
fun around(curX: Int, curY: Int, map: Array<String>): Boolean {
    var dx = intArrayOf(0,0,1,-1)
    var dy = intArrayOf(1,-1,0,0)
    // 1일 때
    for(i in 0 until 4) {
        var x = curX + dx[i]
        var y = curY + dy[i]
        if(x>=0 && y>=0 && x<5 && y<5) {
            if(map[x][y] == 'P') { //
                return true
            }
        }
    }
    // 2일 때
    var twoDx = arrayOf(0,0,2,-2)
    var twoDy = arrayOf(2,-2,0,0)
    for(i in 0 until 4) {
        var x = curX + twoDx[i]
        var y = curY + twoDy[i]
        if(x>=0 &&y>=0 && x<5 && y<5) {
            if(map[x][y] == 'P' && map[(curX + x)/2][(curY + y)/2] !='X') {
                return true
            }
        }
    }
    // 대각선
    var diagonalDx = arrayOf(1,1,-1,-1) // 오위 왼위 왼아 오아래
    var diagonalDy = arrayOf(1,-1,1,-1)
    for(i in 0 until 4) {
        var x = curX + diagonalDx[i]
        var y = curY + diagonalDy[i]
        if(x>=0 &&y>=0 && x<5 && y<5) {
            if(map[x][y] == 'P' && map[curX][y] !='X' && map[x][curY] != 'X') {
                return true
            }
        }
    }
    return false
}