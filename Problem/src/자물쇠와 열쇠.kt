fun main() {
    solution(arrayOf(intArrayOf(0,0,0),intArrayOf(1,0,0),intArrayOf(0,1,1)), arrayOf(intArrayOf(1,1,1),intArrayOf(1,1,0),intArrayOf(1,0,1)))
}
fun solution(key1: Array<IntArray>, lock: Array<IntArray>): Boolean {
    var key = key1
    var extendedLock = extendLock(lock)
    for(i in 0..3) {
        key =  rotate(key)
        for(x in 0 until lock.size * 2) {
            for(y in 0 until lock.size * 2) {
                for(a in key.indices) {
                    for(b in key.indices) {
                        extendedLock[x+a][y+b] += key[a][b]
                    }
                }
                // 가운데 다 1인지 확인하고 다1이면 true 아니면
                //  extendedLock 다시 새걸로 바꿔주고
                if(checkLock(extendedLock, lock.size)) {
                    return true
                }

                for(a in key.indices) {
                    for(b in key.indices) {
                        extendedLock[x+a][y+b] -= key[a][b]
                    }
                }
            }
        }
    }
    return false
}

fun checkLock(lock: Array<IntArray>, length: Int): Boolean {
    for(i in 0 until length) {
        for(j in 0 until length) {
            if(lock[lock.size/3 +i][lock.size/3 +j] !=1) {
                return false
            }
        }
    }
    return true
}

fun extendLock(lock: Array<IntArray>): Array<IntArray> {
    var temp = Array(lock.size * 3) {IntArray(lock.size*3) {0} }
    for(i in lock.indices) {
        for(j in lock[0].indices) {
            temp[lock.size*3/3 + i][lock.size*3/3 + j] = lock[i][j]
        }
    }
    for(i in temp.indices) {
        for(j in temp[0].indices) {
            print(temp[i][j])
        }
//        println()
    }
    return temp
}

fun rotate(_key: Array<IntArray>): Array<IntArray> {
    var temp = Array(_key.size) { IntArray(_key.size) { 0 } }

    for (i in temp.indices) {
        for (j in temp.indices) {
            temp[j][temp.size - i - 1] = _key[i][j]
        }
    }
//    print(temp.contentDeepToString())
    return temp
}