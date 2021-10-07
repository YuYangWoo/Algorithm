fun main() {
    var N = readLine()!!.toInt()
    var mineArray = Array(N){Array(N) {""} }
    for(i in 0 until N) {
      var input = readLine()!!
        for(j in input.indices) {
            mineArray[i][j] = input[j].toString()
        }
    }
    var openArray = Array(N) {Array(N){""} }
    for(i in 0 until N) {
        var input = readLine()!!
        for(j in input.indices) {
            openArray[i][j] = input[j].toString()
        }
    }
    var addArray = Array(N) { Array(N) {""} }
    var lose = false
    for(i in 0 until N) {
        for(j in 0 until N) {
            if(mineArray[i][j] == "*") {
                addArray[i][j] = "*"
            }
            else if(openArray[i][j] == "x") {
                addArray[i][j] = "x"
            }
            else if(openArray[i][j] == ".") {
                addArray[i][j] = "."
            }
             if(mineArray[i][j] == "*" && openArray[i][j] == "x") {
                 lose = true
             }
        }
    }
    var resultArray = Array(N) { Array(N) {""} }

    var dx = arrayOf(1,0,-1,0) // 상하좌우
    var dy = arrayOf(0,1,0,-1)
    var diagonalX = arrayOf(1,1,-1,-1) // 대각선
    var diagonalY = arrayOf(1,-1,1,-1)
    for(i in addArray.indices) {
        for(j in addArray[0].indices) {
            var cnt = 0
             if(openArray[i][j] == ".") {
                resultArray[i][j] = "."
                 continue
            }
            if(addArray[i][j] == "x") {
                for(z in dx.indices) {
                    if(i + dx[z] >=0 &&i+dx[z]<N && j+dy[z] >=0 && j+dy[z] <N && addArray[i+dx[z]][j+dy[z]] == "*") {
                        cnt++
                    }
                }
                for(x in diagonalX.indices) {
                    if(i + diagonalX[x] >=0 &&i+diagonalX[x]< N && j+diagonalY[x] >=0 && j+diagonalY[x] <N &&addArray[i+diagonalX[x]][j+diagonalY[x]] == "*") {
                        cnt++
                    }
                }
            }
           resultArray[i][j] = cnt.toString()
        }
    }
    if(lose) {
        for (i in resultArray.indices) {
            for (j in resultArray[0].indices) {
                if (mineArray[i][j] == "*") {
                    resultArray[i][j] = "*"
                }

            }
        }
    }
    for(i in resultArray.indices) {
        for(j in resultArray[0].indices) {
            print(resultArray[i][j])
        }
        println()
    }
}