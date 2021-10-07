import kotlin.math.max

fun main() {
    var N = readLine()!!.toInt()
    var array = Array(N) { IntArray(3) }
    for (i in 0 until N) {
        var list = readLine()!!.split(" ").map { it.toInt() }
        for (j in list.indices) {
            array[i][j] = list[j]
        }
    }

    var one = Array(3) { 0 }
    var two = Array(3) { 0 }
    var three = Array(3) { 0 }
    for (i in array.indices) {
        for (j in array[0].indices) {
            if (j == 0) {
                if (array[i][j] == 3) {
                    one[0]++
                } else if (array[i][j] == 2) {
                    one[1]++
                } else {
                    one[2]++
                }
            } else if (j == 1) {
                if (array[i][j] == 3) {
                    two[0]++
                } else if (array[i][j] == 2) {
                    two[1]++
                } else {
                    two[2]++
                }
            } else {
                if (array[i][j] == 3) {
                    three[0]++
                } else if (array[i][j] == 2) {
                    three[1]++
                } else {
                    three[2]++
                }
            }
        }
    }

    var onePoint = one[0] * 3 + one[1] * 2 + one[2] * 1 // 5
    var twoPoint = two[0] * 3 + two[1] * 2 + two[2] * 1 // 5
    var threePoint = three[0] * 3 + three[1] * 2 + three[2] * 1 // 8
    var max = max(max(onePoint, twoPoint), threePoint)

    if (onePoint > max(twoPoint, threePoint)) {
        print("1 $max")
    } else if (twoPoint > max(onePoint, threePoint)) {
        print("2 $max")
    } else if (threePoint > max(onePoint, twoPoint)) {
        print("3 $max")
    } else if(onePoint == twoPoint && onePoint == threePoint) {
        if(one[0] > two[0] && one[0] > three[0]) {
            print("1 $max")
        }
        else if(two[0] > one[0] && two[0] > three[0]) {
            print("2 $max")
        }
        else if(three[0] > one[0] && three[0] > two[0]) {
            print("3 $max")
        }
        else if(one[0] > two[0]) {
            if(one[1] > two[1]) print("1 $max")
            else if(two[1] > one[1]) print("2 $max")
            else print("0 $max")
        }
        else if(one[0] > three[0]) {
            if(one[1] > three[1]) print("1 $max")
            else if(three[1] > one[1]) print("3 $max")
            else print("0 $max")
        }
        else if(two[0] > three[0]) {
            if(two[1] > three[1]) print("2 $max")
            else if(three[1] > two[1]) print("3 $max")
            else print("0 $max")
        }
        else print("0 $max")
    }
    else if (onePoint == twoPoint) {

        if (one[0] == two[0]) {
            if (one[1] > two[1]) {
                print("1 $max")
            } else if (one[1] < two[1]) {
                print("2 $max")
            } else {
                print("0 $max")
            }
        } else if (one[0] > two[0]) {
            print("1 $max")
        } else if (one[0] < two[0]) {
            print("2 $max")
        }

    } else if (onePoint == threePoint) {
        if (one[0] == three[0]) {
            if (one[1] > three[1]) {
                print("1 $max")
            } else if (one[1] < three[1]) {
                print("3 $max")
            } else {
                print("0 $max")
            }
        } else if (one[0] > three[0]) {
            print("1 $max")
        } else if (one[0] < three[0]) {
            print("3 $max")
        }
    } else if (twoPoint == threePoint) {
        if (two[0] == three[0]) {
            if (two[1] > three[1]) {
                print("2 $max")
            } else if (two[1] < three[1]) {
                print("3 $max")
            } else {
                print("0 $max")
            }
        } else if (two[0] > three[0]) {
            print("2 $max")
        } else if (two[0] < three[0]) {
            print("3 $max")
        }
    }
}